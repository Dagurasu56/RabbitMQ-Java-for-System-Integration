package com.course.rabbitmq.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.course.rabbitmq.producer.producer.HelloRabbitProducer;

@SpringBootApplication
@EnableScheduling
public class Application implements CommandLineRunner {

	//@Autowired
	//private HelloRabbitProducer producer;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//producer.sendHello("Douglas Souza" + Math.random());
	}
}
