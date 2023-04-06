package com.skillstorm.week2;

public class FindMaxAssignment {
	public static void main(String[] args) {
		int[] nums = { -10, -20, -30, -40, -50 };
		System.out.println(findMax(nums));
		

	}

	public static int findMax(int[] numbers) {
		int i = 0;
		int max = Integer.MIN_VALUE;
		if (numbers == null || numbers.length <= 0) 
		return Integer.MIN_VALUE;	
		else { 
		
		while (i < numbers.length) {
			max = Math.max(max, numbers[i]);
			i++;
				
			}
		return max;
		}
		}
		
}
