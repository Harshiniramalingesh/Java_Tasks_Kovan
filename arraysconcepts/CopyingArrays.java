package arraysconcepts;

public class CopyingArrays {
    public static void main(String[] args) {
		int[] copyFrom = {10,20,30,40,50};
		int[] copyTo = new int[5];
		
		System.arraycopy(copyFrom , 0 , copyTo , 0 , 5);
		
		for(int i : copyTo) {
			System.out.println(i);
		}

	}
}
