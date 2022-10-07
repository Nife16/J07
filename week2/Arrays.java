package week2;

import java.util.Scanner;

import javax.sound.midi.ShortMessage;

public class Arrays {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
//		testForValue(new int[]{1,2,3,4,5,6,7,8}, scanner);
//		findIndexOfElement(new int[]{1,2,3,4,5,6,7,8}, scanner);

		findMissingNumber(new int[]{10,11,12,13,14,16,17,18});
		
	}
	
//	Write a Java program to test if an array contains a specific value.

	public static void testForValue(int[] numArray, Scanner scanner) {
		
		boolean isSpecificValue = false;
		System.out.println("Please give us your specific value: ");
		int specificValue = scanner.nextInt();
		
		
		for (int number : numArray) {
			
			if(number == specificValue) {
				isSpecificValue = true;
			}
			
		}
		
		if(isSpecificValue) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
	}
	
	//Write a Java program to find the index of an array element.
	public static void findIndexOfElement(int[] numArray, Scanner scanner) {
		
		int foundIndex = -1;
		
		System.out.println("What is the number you want to search the index of: ");
		int number = scanner.nextInt();
		
		for (int i = 0; i < numArray.length; i++) {
			
			if(number == numArray[i]) {
				
				foundIndex = i;
				
			}
			
		}
		
		if(foundIndex > -1) {
			System.out.println(foundIndex);
		} else {
			System.out.println("WE DIDNT FIND NOTHIN");
		}
		
		
	}
	
	

	//Write a Java program to find a missing number in an array.	
	public static void findMissingNumber(int[] numArray) {
		
		
		int stageNumber = numArray[0];
		int missingNumber = Integer.MIN_VALUE;
		
		for (int i = 1; i < numArray.length; i++) {
			
			
			if((stageNumber+1 != numArray[i])) {
				
				missingNumber = stageNumber+1;
				break;
				
			} else {
				
				stageNumber = numArray[i];
				
			}
			
			
		}
		
		if(missingNumber != Integer.MIN_VALUE) {
			System.out.println(missingNumber);
		} else {
			System.out.println("No missing number found!");
		}
		
	}
	
}









