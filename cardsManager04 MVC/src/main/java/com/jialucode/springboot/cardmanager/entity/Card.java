package com.jialucode.springboot.cardmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name="card")
public class Card {
    //define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "card_type")
    private String cardType;
    @Column(name = "cardholder_name")
    private String cardholderName;
    @Column(name = "card_number")
    private String cardNumber;
    @Column(name = "pin")
    private String pin;
    @Column(name = "CVR")
    private String CVR;
    @Column(name = "bank_name")
    private String bankName;

    @Column(name = "expire_date")
    private String expireDate;

    @Column(name = "limited")
    private String limited;
    //define constructors

    public Card(){

    }

    public Card(String cardType, String cardholderName, String cardNumber, String pin, String CVR, String bankName, String expireDate, String limited) {
        this.cardType = cardType;
        this.cardholderName = cardholderName;
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.CVR = CVR;
        this.bankName = bankName;
        this.expireDate = expireDate;
        this.limited = limited;
    }

    //define getter/setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardholderName() {
        return cardholderName;
    }

    public void setCardholderName(String cardholderName) {
        this.cardholderName = cardholderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCVR() {
        return CVR;
    }

    public void setCVR(String CVR) {
        this.CVR = CVR;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getLimited() {
        return limited;
    }

    public void setLimited(String limited) {
        this.limited = limited;
    }


    //define toString

    @Override
    public String toString() {
        return "Card{" +
                "id=" + id +
                ", cardType='" + cardType + '\'' +
                ", cardholderName='" + cardholderName + '\'' +
                ", cardNumber='" + cardNumber + '\'' +
                ", pin='" + pin + '\'' +
                ", CVR='" + CVR + '\'' +
                ", bankName='" + bankName + '\'' +
                ", expireDate='" + expireDate + '\'' +
                ", limited='" + limited + '\'' +
                '}';
    }
}
