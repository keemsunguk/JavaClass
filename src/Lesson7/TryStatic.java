package Lesson7;
import java.util.Scanner;


public class TryStatic {

	/**
	 * @param args
	 */
	
	static double [] data;
	
	public static void main(String[] args) {

		Ex1 a = new Ex1();
		Ex1 b = new Ex1(2, "John", "Doe");
		b.PrintIdentity();			
		a.PrintIdentity();
		
		a.firstName = "Jane";
		a.lastName = "Doe";
		a.PrintIdentity();
		
		Ex1.model = 4;
		b.PrintIdentity();			
		a.PrintIdentity();
		
		Object obj = new Object();
		StatFunctions abc = (StatFunctions)obj;

		makeData();
		
	}

	//////////////////////////////////////////////////////////////
	private static void makeData() {
		Scanner input = new Scanner (System.in);
		System.out.print("How many input data? ");
		int array_size = input.nextInt();
		
		data = new double[array_size];

		for(int i = 0; i < array_size; i++) {
			data[i] = Math.random()*100;
		}		
	}

}
