package com.jialucode.springboot.cardmanager.dao;

import com.jialucode.springboot.cardmanager.entity.Card;

import java.util.List;

public interface CardDAO {
    List<Card> findAll();

    Card findById(int theId);

    Card save(Card theCard);

    void deleteById(int theId);

}
