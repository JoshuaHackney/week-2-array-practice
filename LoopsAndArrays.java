package com.skillstorm.week2;

public class LoopsAndArrays {
	public static void main(String[] args) {
	int[] nums = { 1, 2, 3 };
	printArray(nums);
	nums = new int [0];
	printArray(nums);

}
public static void printArray(int[] numbers) {
	if (numbers == null)
		numbers = new int[0];

	int i = 0;
	while (i < numbers.length) {
		System.out.println("numbers[" + i + "] = " + numbers[i]);
		i++;
	}
	
}







}