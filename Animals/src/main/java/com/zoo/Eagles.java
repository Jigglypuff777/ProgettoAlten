package com.zoo;

import java.sql.Date;
import java.time.LocalDate;

public class Eagles extends Animal implements AnimalsWithWings{
	int widthOfWings;
		
	Eagles(String name, String favFood, int age, LocalDate entryDate, int weight, int height, int widthOfWings){
		super(name,favFood,age,entryDate,weight,height);
		this.widthOfWings = widthOfWings;
	}

	@Override
	public String toString() {
		return "Aquila " + super.toString()+ "aperturaAli = " + this.widthOfWings + "cm";
	}
	
	@Override
    public int getLargestWings() {
        return widthOfWings;
    }
	
		
}
