package Ateliers.domain;

import java.awt.Color;
import java.awt.Point;

public abstract class Fruit {
	
	private Point point;
	
	public Fruit(Point point){
		this.point = point;
	}
	
	public Point getPoint() {
		return point;
	}

	public abstract Color getColor();

}
