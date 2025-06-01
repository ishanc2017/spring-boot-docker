package testmicroservices.dockerdemo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TestController {

	@GetMapping("/test-docker")
	public String displayTestMessage() {
		return "Hello, Ishan! This is a test message from the Dockerized Spring Boot application.";
	}

}
