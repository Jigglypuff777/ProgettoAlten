package com.zoo;

import java.time.LocalDate;

public class Tigers extends Animal implements AnimalsWithTail{
    int lenghtTail;

    Tigers(String name, String favFood, int age, LocalDate entryDate, int weight, int height, int lenghtTail){
        super(name,favFood,age,entryDate,weight,height);
        this.lenghtTail = lenghtTail;
    }


    @Override
    public int getLongestTail() {
        return lenghtTail;
    }


}
