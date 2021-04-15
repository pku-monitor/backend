package br.unicentro.pkubackend.dto;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Usuarios")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String email;
    private Date birthDate;
    private String password;

    public User(String name, String email, Date birthDate, String password) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }
}
