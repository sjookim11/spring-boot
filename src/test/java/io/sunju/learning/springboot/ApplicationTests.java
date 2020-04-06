package io.sunju.learning.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

	@Test
	public static void main(String[] args) {
		SpringApplication.run(ApplicationTests.class, args);
		System.out.println("hello");
	}

}
