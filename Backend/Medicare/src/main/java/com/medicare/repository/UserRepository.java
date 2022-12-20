package com.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
