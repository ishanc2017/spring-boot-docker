package testmicroservices.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping("/test-docker")
	public String displayTestMessage() {
		return "Welcome to docker-microservice demo!!";
	}

}
