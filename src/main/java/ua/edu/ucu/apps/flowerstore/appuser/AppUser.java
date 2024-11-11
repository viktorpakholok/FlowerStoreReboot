package ua.edu.ucu.apps.flowerstore.appuser;

import java.time.LocalDate;
import java.time.Period;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(unique = true)
    private String email;
    private LocalDate dob;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int age;

    public AppUser(String email, LocalDate dob) {
        this.email = email;
        this.dob = dob;
    }

    public int getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
