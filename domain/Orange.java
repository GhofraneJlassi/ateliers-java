package Ateliers.domain;

import java.awt.Color;
import java.awt.Point;

public class Orange extends Fruit {
	
	private Color color;
	
	public Orange(Point point) {
		super(point);
		this.color = Color.ORANGE;
	}

	public Color getColor(){
		return color;
	}
}
