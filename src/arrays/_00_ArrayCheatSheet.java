package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String fruits[]= {"Mango", "Pineapple", "Apple", "Banana", "Orange"};
		//2. print the third element in the array
		System.out.println(fruits.length-2);
		
		//3. set the third element to a different value
		fruits[2]="Peach";
		//4. print the third element again
	System.out.println(fruits.length-2);	
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0;i< fruits.length; i++) {
			System.out.println(i);
		}
		
		//6. make an array of 50 integers
	int[]numbers=new int[50];
		//7. use a for loop to make every value of the integer array a random number
	Random rand  = new Random();
		for(int i=0; i<numbers.length; i++) {
			//System.out.println(i);
			numbers[i]=rand.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
			
		
		//9 print the entire array to see if step 8 was correct
	
		//10. print the largest number in the array.
		int low=Integer.MAX_VALUE;
		int high=Integer.MIN_VALUE;
		System.out.println(low);
		System.out.println(high);

	
		for(int i=0; i<numbers.length; i++) {
			//System.out.println(i);
			//numbers[i]=rand.nextInt();
			if(numbers[i]<low) {
				low=numbers[i];
				
			}
			if(numbers[i]>high) {
				high=numbers[i];
				
			}
		}
		System.out.println(low);
		System.out.println(high);
	}
}
