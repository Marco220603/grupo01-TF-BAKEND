package com.example.demo.repository;

import com.example.demo.entities.dato.Questions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IQuestiosnsRepository extends JpaRepository<Questions,Integer> {

    @Query(value = "SELECT\n" +
            "    U.username AS NombreUsuario,\n" +
            "    PuntajeTotal,\n" +
            "    T.name AS Temperamento\n" +
            "FROM\n" +
            "    users U\n" +
            "JOIN (\n" +
            "    SELECT\n" +
            "        RU.usersid,\n" +
            "        SUM(RU.score) AS PuntajeTotal\n" +
            "    FROM\n" +
            "        resulado_preguntas RU\n" +
            "    GROUP BY\n" +
            "        RU.usersid\n" +
            ") AS SubqueryPuntaje ON U.id = SubqueryPuntaje.usersid\n" +
            "JOIN temper T ON SubqueryPuntaje.PuntajeTotal >= T.min_score;",nativeQuery = true)
    public List<String[]>calcularTemper();


}
