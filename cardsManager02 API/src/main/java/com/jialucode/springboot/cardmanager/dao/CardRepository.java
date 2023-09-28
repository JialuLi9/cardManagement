package com.jialucode.springboot.cardmanager.dao;

import com.jialucode.springboot.cardmanager.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {

}
