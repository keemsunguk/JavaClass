package Lesson3;


public class ClassEx {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		MyAdd a = new MyAdd();
		MyAdd b = new MyAdd(100,200);
		
		MyAdd c = null;
		
		/*a.i = 5;
		a.j = 6;
		b.i = 11;
		b.j = 12;
		*/
		
		a.set_i(10);
		a.set_j(11);
		
		c = new MyAdd();
		//c.i = 6;
		a.add();
		c.add();
		
		System.out.println("Sum: "+a.getSum());
		System.out.println("Sum: "+b.getSum());
		System.out.println("Sum: "+c.getSum());
		
		a.data = new int[5];
		for(int i = 0; i < 5; i++) {
			a.data[i] = i+1;
		}

		for(int i = 0; i < 5; i++) {
			System.out.println(a.data[i]);
		}
		
		a.set_i(100);
		b.set_i(100);
		System.out.println(a.get_i());
		System.out.println(b.get_i());
	}
	
	public int add(int i, int j) {
		int sum = i + j;
		
		return sum;
	}
	

}
