package arraysconcepts;

import java.util.Arrays;

public class PassingArraystoMethods {
    public static int min(int arr[]) {
	Arrays.sort(arr);
	return arr[0];
}
	public static void main(String[] args) {
		int[] arr = {7,5,4,2,8};
		System.out.println(min(arr));	

	}
}
