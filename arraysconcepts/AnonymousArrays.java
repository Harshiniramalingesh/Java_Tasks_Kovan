package arraysconcepts;

public class AnonymousArrays {
    public static void printArrays(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		printArrays(new int[] {1,2,3,4,5});

	}
}
