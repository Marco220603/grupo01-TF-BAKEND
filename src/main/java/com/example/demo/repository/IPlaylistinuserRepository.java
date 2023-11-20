package com.example.demo.repository;

import com.example.demo.entities.entitys.Playlistinuser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPlaylistinuserRepository extends JpaRepository<Playlistinuser,Integer> {
}
