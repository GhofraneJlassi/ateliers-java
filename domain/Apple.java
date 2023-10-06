package Ateliers.domain;

import java.awt.Color;
import java.awt.Point;

public class Apple extends Fruit {
	
	private Color color;
	
	public Apple(Point point) {
		super(point);
		this.color = Color.RED;
	}

	public Color getColor(){
		return color;
	}
}
