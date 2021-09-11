package com.lovecoding.ticket;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * @EnableDubbo : 开启dubbo相关的注解应用
 */
@SpringBootApplication
@EnableDubbo
public class ProviderTicketApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderTicketApplication.class, args);
	}

}
