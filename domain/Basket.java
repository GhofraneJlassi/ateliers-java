package Ateliers.domain;

import java.util.LinkedList;
import java.util.List;

public class Basket {
	
	private List<Fruit> fruitList;
	
	public Basket(){
		fruitList = new LinkedList<Fruit>();
	}

	public void add(Fruit aFruit){
		fruitList.add(aFruit);
	}

	public boolean isEmpty() {
		return fruitList.isEmpty();
	}

	public List<Fruit> getFruitList() {
		return fruitList;
	}

	public int getNumberOfFruits() {
		return fruitList.size();
	}
}
