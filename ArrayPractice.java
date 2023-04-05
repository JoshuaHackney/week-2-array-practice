package com.skillstorm.week2;

public class ArrayPractice {
	public static void main(String[] args) {
		System.out.println("The Following is a list of my favorite foods: ");
		
		String[] foods = new String [5];
		foods[0] = "Pizza";
		foods[1] = "Sushi";
		foods[2] = "Pasta"; //will be changed
		foods[3] = "Gyro";
		foods[4] = "Paella";
								
		System.out.println(foods[0] + " " + foods[1] + " " + foods[2] + " " + foods[3] + " " + foods[4]);	
		System.out.println("Oh.. wait a minute Pasta isnt specific enough");
		
		foods = new String [5];
		foods[0] = "Pizza";
		foods[1] = "Sushi";
		foods[2] = "Spaghetti"; //changed
		foods[3] = "Gyro";
		foods[4] = "Paella";
		System.out.println(foods[0] + " " + foods[1] + " " + foods[2] + " " + foods[3] + " " + foods[4]);	
	}

}
