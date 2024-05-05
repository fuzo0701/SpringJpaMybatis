package com.oppo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.oppo.demo.model.User;
import java.util.UUID;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, UUID>{
    
    public Optional<User> findByEmail(String email);

}
