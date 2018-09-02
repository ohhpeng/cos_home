package com.cos_home;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
@MapperScan("com.cos_home.mapper")
public class CosHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(CosHomeApplication.class, args);
	}
}
