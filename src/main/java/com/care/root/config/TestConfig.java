package com.care.root.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
	@Bean
	public TestClass tc() {
		TestClass test = new TestClass();
		test.setName("ȫ�浿");
		return test;
	}
}
