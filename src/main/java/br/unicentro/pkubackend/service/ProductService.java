package br.unicentro.pkubackend.service;

import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public long returnProductById(long id) {
        return id;
    }

    public List<Product> getAllProducts (){
        return productRepository.findAll();
    }

    public long saveProduct(Product product) {
        return productRepository.save(product).getId();
    }
}
