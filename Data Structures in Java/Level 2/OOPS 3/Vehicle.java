package final_keyword;

import generics.PrintInterface;

public final class Vehicle implements PrintInterface{
	protected String color;
	private int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		this.maxSpeed = maxSpeed;
		//System.out.println("Vehicle Constructor");
	}
	
//	public Vehicle() {
//		System.out.println("Vehicle Constructor");
//	}
	
	public int getMaxSpeed() {
		return maxSpeed;
	}
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	public final void print() {
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Speed : " + maxSpeed);
	}
}
