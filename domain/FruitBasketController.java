package Ateliers.domain;

import java.awt.Point;
import java.util.List;

public class FruitBasketController {
	
	private Basket basket;
	
	public enum FruitModes {
	    ORANGE,APPLE
	}
	
	public FruitBasketController (Basket basket){
		this.basket = basket;
	}

	public FruitBasketController() {
		basket = new Basket();
	}

	private void addApple(Point mousePoint) {
		Apple newApple = new Apple(mousePoint);
		basket.add(newApple);
	}
	
	private void addOrange(Point mousePoint) {
		Orange newOrange = new Orange(mousePoint);
		basket.add(newOrange);
	}
	
	public void addFruit(FruitModes fruitMode, Point mousePoint){
		if(fruitMode==FruitModes.ORANGE){
			addOrange(mousePoint);
		}
		else {
			addApple(mousePoint);
		}
	}

	public List<Fruit> getFruitList() {
		return basket.getFruitList();
	}

	public int getNumberOfFruits() {
		return basket.getNumberOfFruits();
	}
}
