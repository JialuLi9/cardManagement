package com.jialucode.springboot.cardmanager.service;

import com.jialucode.springboot.cardmanager.entity.Card;

import java.util.List;

public interface CardService {
    List<Card> findAll();
    Card findById(int theId);

    Card save(Card theCard);

    void deleteById(int theId);
}
