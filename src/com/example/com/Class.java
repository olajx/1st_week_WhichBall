package com.example.com;

public class Class {

	public static void main(String[] args) {

		Ball myBall = new Ball();
		Ball myBall2 = new Ball();
		
		myBall.color = "yellow";
		myBall.type = "tennis";
		
		myBall2.color = "black&white";
		myBall2.type = "soccer";
		
		System.out.println("Ball color is: " + myBall.color + ", type: " + myBall.type);
		System.out.println("My new ball type is : " + myBall2.type + ", color: " + myBall2.color);
		
		myBall.pop();
	}

}
