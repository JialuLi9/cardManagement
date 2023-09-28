package com.jialucode.springboot.cardmanager.controller;

import com.jialucode.springboot.cardmanager.entity.Card;
import com.jialucode.springboot.cardmanager.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController("/cards")
public class CardController {
    private CardService cardService;
    @Autowired
    public CardController(CardService theCardService){
        cardService = theCardService;
    }

    //expose "/cards" and return a list of cards
    @GetMapping("/cards")
    public List<Card> findAll(){
        return cardService.findAll();
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel){

        //create model attribute to bind form data
        Card theCard = new Card();
        theModel.addAttribute("card", theCard );
        return "cards/card-form";
    }

    @GetMapping("/cards/{cardId}")
    public Card getCard(@PathVariable int cardId){
        Card theCard = cardService.findById(cardId);

        if (theCard == null){
            throw new RuntimeException("Card id not found - " + cardId);
        }

        return theCard;
    }

    //add mapping for POST /cards - add new Card
    @PostMapping("/cards")
    public Card addCard(@RequestBody Card theCard){
        //also just in case they pass an id in JSON...set id to 0
        //this is to force a save of new item...instead of update

        theCard.setId(0);
        Card dbCard = cardService.save(theCard);
        return dbCard;
    }

    @PutMapping("/cards")
    public Card updateCards(@RequestBody Card theCard){
        Card dbCard = cardService.save(theCard);
        return dbCard;
    }

    @DeleteMapping("/cards/{cardId}")
    public String deleteCard (@PathVariable int cardId){
        Card tempCard = cardService.findById(cardId);
        //throw exception if null

        if(tempCard == null){
            throw new RuntimeException("Card is not found - " + cardId);
        }
        cardService.deleteById(cardId);

        return "Deleted card is - " + cardId;
    }
}
