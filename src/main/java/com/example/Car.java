package com.example;

/**
 * 車を表すクラス.
 * 
 * @author yuuki
 *
 */
public class Car {
	private int speed;
	private String carName;
	private String bodyColor;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", carName=" + carName + ", bodyColor=" + bodyColor + "]";
	}
	
	
}
