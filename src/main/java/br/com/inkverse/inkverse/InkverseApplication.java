package br.com.inkverse.inkverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.junit.jupiter.api.Test;

@SpringBootApplication
public class InkverseApplication {

	public static void main(String[] args) {
		SpringApplication.run(InkverseApplication.class, args);
	}

}
@SpringBootTest
class InkverseApplicationTests {

	@Test
	void contextLoads() {
	}

}
