package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"controller", "service"})
public class Lecture33Application {

	public static void main(String[] args) {

		SpringApplication.run(Lecture33Application.class, args);

	}
}
