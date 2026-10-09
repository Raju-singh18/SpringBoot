package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootdemoApplication {

	public static void main(String[] args) {

	 ApplicationContext context =  SpringApplication.run(SpringbootdemoApplication.class, args);

	 OrderService order = context.getBean(OrderService.class);
	 order.placeOrder();
	}

//	@Bean
//	public UserService getUserServiceBean(){
//		return  new UserService();
//	}

}
