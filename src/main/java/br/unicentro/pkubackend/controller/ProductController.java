package br.unicentro.pkubackend.controller;

import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces= MediaType.APPLICATION_JSON_VALUE)
    public long addNewProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @GetMapping("/{id}")
    public Product returnProductId(@PathVariable(value = "id") long id) {
       return productService.returnProductById(id);
    }

    @GetMapping()
    public List<Product> returnAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/search/{name}")
    public List<Product> returnProductByName(@PathVariable(value = "name") String name) {
        return productService.findProductByName(name);
    }
}
