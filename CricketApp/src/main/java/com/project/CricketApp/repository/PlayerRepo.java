package com.project.CricketApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.CricketApp.entity.PlayerEntity;

@Repository
public interface PlayerRepo extends JpaRepository<PlayerEntity, Long>{

}
