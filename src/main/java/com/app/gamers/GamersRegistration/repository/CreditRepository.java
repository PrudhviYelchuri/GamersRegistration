package com.app.gamers.GamersRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.gamers.GamersRegistration.entity.CreditEntity;

@Repository
public interface CreditRepository extends JpaRepository<CreditEntity, Integer> {

}
