package com.zoo;

import java.sql.Date;
import java.time.LocalDate;

public class Lions extends Animal implements AnimalsWithTail{
    int lenghtTail;

    Lions(String name, String favFood, int age, LocalDate entryDate, int weight, int height, int lenghtTail){
        super(name,favFood,age,entryDate,weight,height);
        this.lenghtTail = lenghtTail;
    }

    @Override
    public String toString() {
        return "Leone " + super.toString()+ "lunghezzaCoda = " + this.lenghtTail + "cm";
    }


    @Override
    public int getLongestTail() {
        return lenghtTail;
    }


}
