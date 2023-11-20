package com.example.demo.repository;

import com.example.demo.entities.dato.Temper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITemperRepository extends JpaRepository<Temper,Integer> {
    @Query(value = "SELECT id_temper, description_temper, min_score, name_temper, id_gender\n" +
            "FROM temperaments\n" +
            "ORDER BY min_score DESC\n" +
            "LIMIT 1;",nativeQuery = true)
    public List<String[]> TemperConMayorPuntaje();
}
