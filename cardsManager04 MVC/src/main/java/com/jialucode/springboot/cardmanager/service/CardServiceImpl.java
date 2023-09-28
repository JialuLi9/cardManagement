package com.jialucode.springboot.cardmanager.service;

import com.jialucode.springboot.cardmanager.dao.CardRepository;
import com.jialucode.springboot.cardmanager.entity.Card;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CardServiceImpl implements CardService{
    private CardRepository cardRepository;

    @Autowired
    public CardServiceImpl(CardRepository theCardDAO){
        cardRepository = theCardDAO;
    }
    @Override
    public List<Card> findAll() {
        return cardRepository.findAll();
    }

    @Override
    public Card findById(int theId) {

        Optional<Card> result = cardRepository.findById(theId);

        Card theCard = null;

        if(result.isPresent()){
            theCard = result.get();
        }
        else{
            //didn't find the card
            throw new RuntimeException("Did not find card id - " + theId);
        }
        return theCard;
    }

    //add transactional in service layer since edit the data in the database

    @Override
    public Card save(Card theCard) {
        return cardRepository.save(theCard);
    }

    @Override
    public void deleteById(int theId) {
        cardRepository.deleteById(theId);
    }
}
