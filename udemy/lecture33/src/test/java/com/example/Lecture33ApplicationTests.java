package com.example;

import application.Lecture33Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Lecture33Application.class)
@WebAppConfiguration
public class Lecture33ApplicationTests {

	@Test
	public void contextLoads() {
	}

}
