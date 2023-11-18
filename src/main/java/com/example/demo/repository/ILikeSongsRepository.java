package com.example.demo.repository;

import com.example.demo.entities.dato.Gender;
import com.example.demo.entities.entitys.LikesSongs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILikeSongsRepository extends JpaRepository<LikesSongs,Integer> {
}
