package com.demo.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	@Autowired Message message;

	public static ApplicationContext applicationContext;

	@Autowired @Qualifier("metoda") Message met;

	@Autowired MessageComponent messageComponent;

	public static void main(String[] args) {
		 applicationContext = SpringApplication.run(DemoApplication.class, args);
		 displayAllBeans();
	}

	private void hello() {
		System.out.println("hello world!");
	}

	@Override
	public void run(String... args) throws Exception {
		hello();
		System.out.println(message.getText());
		System.out.println(met.getText());
		System.out.println(messageComponent.getText());

	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}
}
