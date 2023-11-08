package com.example.demo.repository;

import com.example.demo.entities.dato.Temper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITemperRepository extends JpaRepository<Temper,Integer> {
}
