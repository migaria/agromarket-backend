package com.agromarket.agromarket_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import com.mongodb.client.MongoClient;

@SpringBootApplication
public class AgromarketBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgromarketBackendApplication.class, args);
	}

	@Bean
	public MongoTemplate mongoTemplate(MongoClient mongoClient) {
		return new MongoTemplate(mongoClient, "AgroMarket");
	}
}