package com.orm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = "com.orm.onetoone.uni")
//@EntityScan(basePackages = "com.orm.onetoone.bi")
//@EntityScan(basePackages = "com.orm.onetomany.uni")
//@EntityScan(basePackages = "com.orm.onetomany.bi")
//@EntityScan(basePackages = "com.orm.manytomany.uni")
@EntityScan(basePackages = "com.orm.manytomany.bi")
public class OrmMappingApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrmMappingApplication.class, args);
	}

}
