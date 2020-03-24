package com.demo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//creere bean prin adnotare de componenta spring
@Component
public class MessageComponent {


  private String text;

  public MessageComponent(@Value("${app.text}") String text) {
    this.text = text;
  }

  public String getText() {
    return text;
  }
}
