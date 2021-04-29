package br.unicentro.pkubackend.service;

import br.unicentro.pkubackend.dto.LoginForm;
import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.dto.User;
import br.unicentro.pkubackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public long saveUser(User user) {
        return userRepository.save(user).getId();
    }

    public List<User> requestLoginAcess(LoginForm loginForm){
        return userRepository.findUserByEmailAndPassword(loginForm.getEmail(), loginForm.getPassword());
    }

    public int getAge(LocalDate birthDate) {
        return LocalDate.now().getYear() - birthDate.getYear();
    }
}
