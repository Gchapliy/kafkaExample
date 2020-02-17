package com.example.server.demo;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

import java.io.IOException;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages = {
		"com.example.server.demo.config",
		"com.example.server.demo.controller",
		"com.example.server.demo.service",
})
public class ServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerDemoApplication.class, args);
	}

	/*@Bean
	public JsonDeserializer jsonDeserializer() {
		return new JsonDeserializer() {
			@Override
			public Object deserialize(JsonParser p, DeserializationContext context) throws IOException {
				return null;
			}
		};
	}*/

	@Bean
	public ObjectMapper objectMapper() {
		return new ObjectMapper();
	}
}
