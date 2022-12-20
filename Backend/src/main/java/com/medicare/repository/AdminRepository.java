package com.medicare.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

}
