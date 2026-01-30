package arraysconcepts;

public class VarargsExample {
    public static int sum(int... numbers) {
		int total = 0;
        for (int n : numbers) {
            total += n;
        }
        return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(sum(5,6,7));
         System.out.println(sum(10,20,30,40,50,70));
         System.out.println(sum(2));
	}
}
