package com.jialucode.springboot.cardmanager.dao;

import com.jialucode.springboot.cardmanager.entity.Card;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CardDAOJpaImpl implements CardDAO{
    //define field for cardManager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public CardDAOJpaImpl(EntityManager theEntityManager){
        entityManager = theEntityManager;
    }
    @Override
    public List<Card> findAll() {
        //create a query
        TypedQuery<Card> theQuery = entityManager.createQuery("from Card", Card.class);

        //execute query and get result list
        List<Card> cards = theQuery.getResultList();

        //return the results
        return cards;
    }

    @Override
    public Card findById(int theId) {
        Card theCard = entityManager.find(Card.class, theId);
        return theCard;
    }

    @Override
    public Card save(Card theCard) {
        //save the card
        Card dbCard = entityManager.merge(theCard);
        //return the dbCard
        return dbCard;
    }

    @Override
    public void deleteById(int theId) {
        //find card by id
        Card theCard = entityManager.find(Card.class, theId);
        entityManager.remove(theCard);

    }
}
