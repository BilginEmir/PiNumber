import java.util.Scanner;

public class PI {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		System.out.print("Value :");
		int value = inp.nextInt();
		
		int number = 0;
		
		long timeStart = System.currentTimeMillis(); // zaman kavramı için 
		
		for(int i = 0; i < value; i++) {
			double x = Math.random();
			double y = Math.random();
			
			double total = ( x * x ) + ( y * y );
			
			if(total <= 1) {
				number++;
			}
		}
		//System.out.println(number + "...");
		long timeEnd = System.currentTimeMillis(); // başlangıç bitiş sürecini hesaplarız
		
		double PI = 4.0 * number  / value ;
		System.out.println("PI : " + PI);
		
		System.out.println("PII : " + Math.PI);
		
		System.out.println("Times : " + (timeEnd - timeStart) + " milisecond");
	}
}