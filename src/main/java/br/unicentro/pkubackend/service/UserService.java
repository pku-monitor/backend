package br.unicentro.pkubackend.service;

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

    public long returnProductById(long id) {
        return id;
    }

    public List<User> getAllProducts (){
        return userRepository.findAll();
    }

    public long saveProduct(User user) {
        return userRepository.save(user).getId();
    }

    public int getAge(LocalDate birthDate) {
        int age = LocalDate.now().getYear() - birthDate.getYear();
        return age;
    }
}
