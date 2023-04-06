package com.skillstorm.week2;

import java.util.Arrays;

public class MoreLoops {
public static void main(String[] args) {
	int x = 1;
	while (x == 1) {
		System.out.println("Hello");
		x++;
	}
	int count = 3;
	while (count > 0) {
		System.out.println(count);
		count--;
	}
	
	System.out.println("End of main method");
	String str = "Go Team!";
	int index = str.length()-1;
	while(index >= 0) {
			char c = str.charAt(index);		
			System.out.println(c);
			index--;			
	}

	String[] words = "Octo Cat is cool".split(" ");
	index = 0;
	while (index >= 0 && index < 4) {
	String i = words[index];
	System.out.println(i);
	index++;
	}
	
	
}
}
