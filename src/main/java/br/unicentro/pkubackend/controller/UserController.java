package br.unicentro.pkubackend.controller;

import br.unicentro.pkubackend.dto.LoginForm;
import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.dto.User;
import br.unicentro.pkubackend.service.ProductService;
import br.unicentro.pkubackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
    public long addNewUser(@RequestBody User user) {
        return userService.saveUser(user);
    }


    @GetMapping("/{id}")
    public long returnProductId(@PathVariable(value = "id") long id) {
       return id;
    }

    @PostMapping(path = "/login", consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
    public List<User> requestLogin(@RequestBody LoginForm loginForm) {
        return userService.requestLoginAcess(loginForm);
    }

//    @GetMapping("/all")
//    public List<Product> returnAllProducts() {
//
//        return productService.getAllProducts();
//
//
//    }
//


}
