package br.unicentro.pkubackend.repository;

import br.unicentro.pkubackend.dto.Product;
import br.unicentro.pkubackend.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findByName(Long id);
    List<User> findUsersByEmail(String email);

}
