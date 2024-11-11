package ua.edu.ucu.apps.flowerstore.appuser;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserService {
    private AppUserRepository appUserRepository;

    @Autowired
    public AppUserService(AppUserRepository appUserRepository) {
        this.appUserRepository = appUserRepository;
    }

    public List<AppUser> getUsers() {
        return appUserRepository.findAll();
    }

    public void addUser(AppUser appUser) {
        Optional<AppUser> user = appUserRepository.findUserByEmail(appUser.getEmail());
        if (user.isPresent()) {
            throw new IllegalStateException("Email " + appUser.getEmail() + " is already taken");
        }
        appUserRepository.save(appUser);
    }
}
