package ua.edu.ucu.apps.flowerstore.flower;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="flower")
public class FlowerController {
	private final FlowerService flowerService;

	@Autowired
	public FlowerController(FlowerService flowerService) {
		this.flowerService = flowerService;
	}

    @GetMapping // ("/hello")
	public List<Flower> getFlowers() {
		return flowerService.gerFlowers();
	}

	@PostMapping
	public void addFlower(@RequestBody Flower flower) {
		flowerService.addFlower(flower);
	}
}
