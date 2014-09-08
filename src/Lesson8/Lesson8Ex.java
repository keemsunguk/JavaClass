package Lesson8;

public class Lesson8Ex {

	/**
	 * @param args
	 * 
	 * 2008 AP test
	 */
	public static void main(String[] args) {
		int num[] = {1,2,3,4,5,6,7};
		
		int a = sumArray(num);
		
		System.out.println("Sum:" + a);
		
		No10 no10 = new No10();
		
		int ans10 = no10.SearchTarget(9);
		if(ans10 < 0)
			System.out.println("No10: target not found in the array: 9");
		else
			System.out.println("No10:" + ans10);
		
		System.out.println("No11:" + No11("computer"));
		
		
/*		public ArrayList<Vehicle> myVehicle = new ArrayList<Vehicle>();
		
		!(A||B) = !A&&!B
		!(A|B) = !A&!B
		A = 0001
		B = 0111
		
		A|B = 0111
		A&B = 0001
		*/
		
		
	}

	public static int sumArray(int[] key) {
		int res = 0;
		
		for( int k = 1; k <= key.length; k++) {
			res += res + key[k-1];
		}
		
		return res;
	}
	
	public static String No11(String str) {
		String output = "";
		
		for( int k = 1; k < str.length(); k=k+2) {
			output += str.substring(k, k+1);	//k inclusive, k+1 exclusive
		}
		return output;
	}
}
