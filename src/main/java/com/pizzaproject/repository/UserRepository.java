package com.pizzaproject.repository;


import com.pizzaproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    //    @Query("SELECT u FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(String username);

}
