package com.telisco.restAPI_Teslisco;

import java.util.ArrayList;
import java.util.List;

public class FruitRepository {
	
	Fruit[] fruits;
	
	public FruitRepository() {
		
		fruits = new Fruit[3];
		
		Fruit f1 = new Fruit();
		f1.setId("24-583-0264");
		f1.setName("Apple");
		f1.setPrice("$62.02");
		f1.setQuantity(30);
		
		Fruit f2 = new Fruit();
		f2.setId("75-588-0160");
		f2.setName("mango");
		f2.setPrice("$86.41");
		f2.setQuantity(28);
		
		Fruit f3 = new Fruit();
		f3.setId("28-996-2788");
		f3.setName("banana");
		f3.setPrice("$11.11");
		f3.setQuantity(21);
		
		fruits[0] = f1;
		fruits[1] = f2;
		fruits[2] = f3;
	}
	
	public Fruit[] getFruits(){
		return fruits;
	}
	
	public Fruit getFruit(String name) {
		for(Fruit f : fruits) {
			if(f.getName()==name)
				return f;
		}
		//if the item not present i want to display "item not present"
		return new Fruit();
	}

//	public void addNewFruit(Fruit f) {
//		fruits.add(f);
//	}
}
