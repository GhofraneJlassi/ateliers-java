package Ateliers.domain.drawing;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

import Ateliers.domain.FruitBasketController;
import Ateliers.domain.Fruit;

public class FruitBasketDrawer {
	
	private final FruitBasketController controller;
	private Dimension initialDimension;
	private int radius = 50;


	public FruitBasketDrawer(FruitBasketController controller, Dimension initialDimension) {
		this.controller = controller;
		this.initialDimension = initialDimension;
	}

	public void draw(Graphics g) {
		drawBasket(g);
		drawFruits(g);
	}

	private void drawFruits(Graphics g) {
		List<Fruit> fruits = controller.getFruitList();
		for (Fruit fruit: fruits){
			Point fruitPoint = fruit.getPoint();
			Color color = fruit.getColor();
			g.setColor(color);
			g.fillOval((int)fruitPoint.getX()-radius,(int)fruitPoint.getY()-radius, radius*2, radius*2);
		}
	}

	private void drawBasket(Graphics g) {
		int width = (int) initialDimension.getWidth();
		int height = (int) initialDimension.getHeight();
    	g.setColor(new Color(140,98,57));
    	g.fillRect(width/4, (int)(height/1.75), width/2, height/4);
	}
}
