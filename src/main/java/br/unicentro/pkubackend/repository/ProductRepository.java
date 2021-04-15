package br.unicentro.pkubackend.repository;

import br.unicentro.pkubackend.dto.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByName(Long id);

}
