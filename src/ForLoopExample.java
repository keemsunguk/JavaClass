import java.util.Scanner;


public class ForLoopExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double far = 0.0;
		double cel = 0.0;
		
		System.out.print("How many computations? :");
		int endNo = input.nextInt();
		
		for(int i = 0; i < endNo; i++) {
			System.out.print("Enter Farenheit: ");
			far = input.nextDouble();
			cel = (far - 32.0) * 5.0/9.0;
			System.out.format("%.3f \"F\" is %.3f C\n", far, cel);
			
		}
		System.out.println("End");
	}

}
