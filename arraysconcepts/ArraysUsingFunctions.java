package arraysconcepts;

import java.util.Arrays;

public class ArraysUsingFunctions {
    
	public static void main(String[] args) {
		//sorting
		int[] arr1 = {8,5,1,7,3,9,4};
		Arrays.sort(arr1);
		for(int i : arr1) {
		System.out.println(i);
		}
		System.out.println();
		
		//Binary search
		int[] arr2 = {5,4,2,6,3};
		int index1 = Arrays.binarySearch(arr2, 6);
		int index2 = Arrays.binarySearch(arr2, 8);
		System.out.println(index1);
		System.out.println(index2);
		
		//two arrays Equals
		
		int[] arr3 = {5,6};
		int[] arr4 = {5,6};
		System.out.println(Arrays.equals(arr3,arr4));
		
		//fill the entire array with the value
		
		int[] arr5 = new int[5];
		Arrays.fill(arr5, 10);
		for(int i : arr5) {
			System.out.println(i);
		}
		
		//arrays to string
		int[] arr6 = {10,20,30,40};
		System.out.println(Arrays.toString(arr6));
		
		

	}
}
