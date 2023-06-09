package com.example.SpringBoot.Repository;

import com.example.SpringBoot.Entity.Admin;
import com.example.SpringBoot.Entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User,Integer> {
    User findByEmail(String email);
    User findByEmailAndPassword(String email, String password);
}
