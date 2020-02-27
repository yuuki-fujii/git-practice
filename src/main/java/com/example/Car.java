package com.example;

/**
 * 車を表すクラス.
 * 
 * @author yuuki
 *
 */
public class Car {
	private int speed;
<<<<<<< HEAD
	private String carName;
=======
	private String nameOfCar;
>>>>>>> feature/login
	private String bodyColor;
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
<<<<<<< HEAD
	
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
=======
	public String getNameOfCar() {
		return nameOfCar;
	}
	public void setNameOfCar(String nameOfCar) {
		this.nameOfCar = nameOfCar;
>>>>>>> feature/login
	}
	public String getBodyColor() {
		return bodyColor;
	}
	public void setBodyColor(String bodyColor) {
		this.bodyColor = bodyColor;
	}
	@Override
	public String toString() {
<<<<<<< HEAD
		return "Car [speed=" + speed + ", carName=" + carName + ", bodyColor=" + bodyColor + "]";
=======
		return "Car [speed=" + speed + ", nameOfCar=" + nameOfCar + ", bodyColor=" + bodyColor + "]";
>>>>>>> feature/login
	}
	
	
}
