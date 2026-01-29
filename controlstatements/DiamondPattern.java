package controlstatements;

public class DiamondPattern {
    public static void main(String[] args) {
		 int n = 7;
	        

	        for (int i = 0; i <= (n/2); i++) {
	            for (int space = 0; space < (n/2) - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 0; star < 2 * i + 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        for (int i = (n/2) - 1; i >= 0; i--) {
	            for (int space = 0; space < (n/2) - i; space++) {
	                System.out.print(" ");
	            }
	            for (int star = 0; star < 2 * i + 1; star++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	}
}
