package stringsandregex;

public class StringBufferBuilderDifference {
    public static void main(String[] args) {
		long startTime1 = System.currentTimeMillis();
		StringBuffer strBuf = new StringBuffer("Hello");
		
		for(int i = 0;i<10000;i++) {
			strBuf.append("World!");
		}
		
		System.out.println("Time Taken for String Buffer: " + (System.currentTimeMillis() - startTime1) + "ms");
      
		long startTime2 = System.currentTimeMillis();
		StringBuilder strBud = new StringBuilder("Hello");
		
		for(int i = 0;i<10000;i++) {
			strBud.append("World!");
		}
		
		System.out.println("Time Taken for String Builder: " + (System.currentTimeMillis() - startTime2) + "ms");
      
	}
}
