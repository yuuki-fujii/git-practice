package com.example;

/**
 * 車を表すクラス.
 * 
 * @author yuuki
 *
 */
public class Car {
	private int speed;
	private String nameOfCar;
	private String bodyColor;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getNameOfCar() {
		return nameOfCar;
	}
	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", nameOfCar=" + nameOfCar + ", bodyColor=" + bodyColor + "]";
	}
	
	
}
