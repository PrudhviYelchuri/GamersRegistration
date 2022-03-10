package com.app.gamers.GamersRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.gamers.GamersRegistration.entity.GamerEntity;

public interface GamerRepository extends JpaRepository<GamerEntity, Integer>{

}
