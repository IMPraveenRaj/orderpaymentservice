package com.springheaven.orderpaymentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OrderpaymentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderpaymentserviceApplication.class, args);
	}

}
