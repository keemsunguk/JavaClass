package Lesson3;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
// TODO Auto-generated method stub
//HW: Expand Ex3 to use all 4 operations using the functions add(), sub(), mul(), div(), pwr (base, exp_
//In div(), if the divisor is zero, then print "infinity" and return maximum value of double.
// If the numerator and divisor are both 0, print "no clue" and return zero
		double x = 0.0;
		double y = 0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter 1st number:");
		x = input.nextDouble();
		
		System.out.print("Enter 2nd number:");
		y = input.nextDouble();
		
		double z1 = 0.0;
		double z2 = 0.0;
		double z3 = 0.0;
		double z4 = 0.0;
		double z5 = 0.0;
		
		
		z1 = mul(x,y);
		z2 = add (x,y);
		z3 = sub(x,y);
		z4 = div(x,y);
		z5 = pow(x, y);  //x^y
		
		System.out.println("Product : "+z1);
		System.out.println("Sum     : "+z2);
		System.out.println("Diff    : "+z3);
		System.out.println("Quotient: "+z4);
		System.out.println("Power   : "+z5);
		
	}
	// My Multiplication
	
	public static double add(double x, double y) {
		Double res;
		res = x+y;
		
		return res;
	}
	public static double sub(double x, double y) {
		Double res;
		res = x-y;
		
		return res;
	}
	public static double div(double x, double y) {
		Double res=0.0;
		
		if( y == 0.0) {
			return res.MAX_VALUE;
		}
		
		res = x/y;
		
		return res;
	}

	/*
	 * return the product of x and y
	 */
	public static double mul(double x, double y){
		Double res = 0.0;
		
		//res.MAX_VALUE
		
		for(int i = 0; i < (int)y; i++) {
			res += x;
		}
		return res; 
	}
	
	/*
	 * return the product of x and y
	 */
	public static double pow(double x, double y){
		Double res = 1.0;
		
		//res.MAX_VALUE
		
		for(int i = 0; i < (int)y; i++) {
			res *= x;
		}
		return res; 
	}

}