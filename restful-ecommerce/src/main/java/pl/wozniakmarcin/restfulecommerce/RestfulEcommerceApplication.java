package pl.wozniakmarcin.restfulecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin

@SpringBootApplication
public class RestfulEcommerceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulEcommerceApplication.class, args);
	}

}
