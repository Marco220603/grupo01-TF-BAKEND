package com.example.demo.repository;

import com.example.demo.entities.dato.Songs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISongsRepository extends JpaRepository<Songs,Integer> {
}