package com.sumanthbayya.product_service_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages={"com.sumanthbayya.repositories","com.sumanthbayya.controllers","com.sumanthbayya.services","com.sumanthbayya.filters"})
@EnableJpaRepositories(basePackages="com.sumanthbayya.repositories")
@EntityScan(basePackages="com.sumanthbayya.entities")
@SpringBootApplication
public class ProductServiceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceDemoApplication.class, args);
	}
}
