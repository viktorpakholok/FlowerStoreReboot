package ua.edu.ucu.apps.flowerstore.flower;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<Flower, Long>{
    
}
