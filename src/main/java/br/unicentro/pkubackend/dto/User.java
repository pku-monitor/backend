package br.unicentro.pkubackend.dto;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table (name = "Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private LocalDate birthDate;
    private String password;
    private long weight;

    public User(String name, String email, LocalDate birthDate, String password) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
    }

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
}
