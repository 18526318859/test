package com.example.demo;

import com.example.demo.pojo.Dog;
import com.example.demo.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class DemoApplicationTests {
    @Autowired
	private Person person;
	@Test
	void contextLoads() {
		System.out.println (person );
	}


}
