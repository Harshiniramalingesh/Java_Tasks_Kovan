package controlstatements;

public class LabelsChecking {
    public static void main(String[] args) {
		outer:
			for (int i = 1; i <= 3; i++) {
				
			    for (int j = 1; j <= 3; j++) {
			        if (i == 2 && j == 2) {
			            break outer;
			        }
			        System.out.println(i + " " + j);
			    }
			}
		System.out.println();
		
			for(int i = 1;i<=3;i++) {
				inner:
				for(int j = 1;j<=3;j++) {
					if(j==2) {
						continue inner;
					}
					System.out.println(i + " " + j);
				}
			}
		System.out.println();
		int[] arr = { 1,2,3,4,5};
		
          for(int i : arr) {
        	  if(i == 4) {
        		  continue;
        	  
        	  
          }
        	  System.out.print(i + " ");
          }
	}
}
