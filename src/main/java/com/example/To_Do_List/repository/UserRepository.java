package com.example.To_Do_List.repository;

import com.example.To_Do_List.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Additional custom queries (if needed)
}
