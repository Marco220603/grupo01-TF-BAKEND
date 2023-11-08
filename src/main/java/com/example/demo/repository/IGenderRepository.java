package com.example.demo.repository;

import com.example.demo.entities.dato.Gender;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IGenderRepository extends JpaRepository<Gender,Integer> {
}
