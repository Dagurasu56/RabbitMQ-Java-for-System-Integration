package com.course.rabbitmq.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.json.JsonMapper;

@Configuration
public class RabbitMQConfig {

	@Bean
	private ObjectMapper objectMapper() {
		return JsonMapper.builder().findAndAddModules().build();
	}
}
