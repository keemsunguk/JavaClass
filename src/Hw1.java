import java.util.Scanner;


public class Hw1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number: ");
		double x1 = input.nextDouble();
		System.out.print("Enter 2nd number: ");
		double x2 = input.nextDouble();
		
		double resAdd = x1 + x2;
		System.out.println(x1+" + "+x2+" = "+resAdd);
		double resDiv = x1/x2;
		//System.out.print(x1+" / "+x2+" = "+resDiv);
		System.out.format("%.2f / %.2f = %.4f\n", x1, x2, resDiv);
		
		
	}

}
