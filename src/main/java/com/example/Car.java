package com.example;

/**
 * 車を表すクラス.
 * 
 * @author yuuki
 *
 */
public class Car {
	private int speed;
	private String name;
	private String bodyColor;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", name=" + name + ", bodyColor=" + bodyColor + "]";
	}
	
}
