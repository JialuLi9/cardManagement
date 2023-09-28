package com.jialucode.springboot.cardmanager.service;

import com.jialucode.springboot.cardmanager.dao.CardDAO;
import com.jialucode.springboot.cardmanager.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CardServiceImpl implements CardService{
    private CardDAO cardDAO;

    @Autowired
    public CardServiceImpl(CardDAO theCardDAO){
        cardDAO = theCardDAO;
    }
    @Override
    public List<Card> findAll() {
        return cardDAO.findAll();
    }

    @Override
    public Card findById(int theId) {
        return cardDAO.findById(theId);
    }

    //add transactional in service layer since edit the data in the database
    @Transactional
    @Override
    public Card save(Card theCard) {
        return cardDAO.save(theCard);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        cardDAO.deleteById(theId);
    }
}
