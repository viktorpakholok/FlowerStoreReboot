package ua.edu.ucu.apps.flowerstore;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.ucu.apps.flowerstore.flower.Flower;
import ua.edu.ucu.apps.flowerstore.flower.FlowerType;

@SpringBootApplication
@RestController
public class FlowerstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlowerstoreApplication.class, args);
	}
}
