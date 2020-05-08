package com.xnpool.scheduler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@EnableAutoConfiguration
@ServletComponentScan // 扫描到自己编写的servlet和filter
@SpringBootApplication() ///*scanBasePackages="com.xnpool.scheduler",exclude={DataSourceAutoConfiguration.class}*/
public class QuartzApplication {

	public static void main(String[] args) {


		SpringApplication.run(QuartzApplication.class, args);
	}

}
