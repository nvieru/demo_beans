package com.demo.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//creere bean prin configurare
@Configuration
public class BasicConfig {

  @Bean
  public Message message(@Value("${app.text}") String text) {
    return new Message(text);
  }

  @Bean(name = "metoda")
  public Message metoda() {
    return new Message("metoda 11234");
  }


}
