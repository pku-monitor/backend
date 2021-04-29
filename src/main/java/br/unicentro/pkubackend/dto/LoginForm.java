package br.unicentro.pkubackend.dto;

import javax.persistence.*;
import java.time.LocalDate;

public class LoginForm {
    private String email;
    private String password;

    public LoginForm(String email, String password) {
        this.email = email;
        this.password = password;
    }
    public LoginForm() { }
    public String getEmail() {return email;}
    public String getPassword() {return password;}
}
