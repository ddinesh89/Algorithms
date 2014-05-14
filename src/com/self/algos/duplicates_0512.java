/**
 * 
 */
package com.self.algos;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


/**
 * @author ddeiveegan
 * Remove duplicates from an array
 */
public class duplicates_0512 {

	private int [] inputArray;
	private int [] outputArray;
	
	public void removeDuplicates () {
		HashSet<Integer> integerSet = new HashSet<Integer>();
		for (int number : inputArray) {
			integerSet.add(number);
		}
		outputArray = new int[integerSet.size()];
		int iter = 0;
		for (int number : integerSet) {
			outputArray[iter] = number;
			iter++;
		}
	}
	
	public void readInput () {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of the array");
		int count = input.nextInt();
		inputArray = new int[count];
		System.out.println("Enter the array content");
		for (int iter = 0; iter < count; iter++) {
			inputArray[iter] = input.nextInt();
		}
	}
	
	public void displayOutput() {
		System.out.println("Final Result");
		for(int number : outputArray) {
			System.out.print(" "+number);
		}
	}
	
	public void setInputArray(int[] input) {
		int iter = 0;
		int length = input.length;
		inputArray = new int[length];
		for(int number: input) {
			inputArray[iter] = number;
			iter ++;
		}
	}
	
	public int[] getOutputArray() {
		Arrays.sort(outputArray);
		return outputArray;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicates_0512 duplicate = new duplicates_0512();
		duplicate.readInput();
		duplicate.removeDuplicates();
		duplicate.displayOutput();
	}

}
