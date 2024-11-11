package ua.edu.ucu.apps.flowerstore.appuser;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppUserRepository  extends JpaRepository<AppUser, Long>{
    @Query("SELECT u FROM app_user u WHERE u.email = ?1")
    Optional<AppUser>findUserByEmail(String email);

    List<AppUser> findAll();
}
