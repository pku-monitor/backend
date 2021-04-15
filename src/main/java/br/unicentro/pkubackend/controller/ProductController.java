package br.unicentro.pkubackend.controller;

import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.service.ProductService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/produto")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("/{id}")
    public long returnProductId(@PathVariable(value = "id") long id) {

       return productService.returnProductById(id);
    }

    @GetMapping("/all")
    public List<Product> returnAllProducts() {

        return productService.getAllProducts();


    }

    @PostMapping(path = "/add", consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
    public long returnProductId(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

}
