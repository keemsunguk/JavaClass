package Lesson3;

public class MyAdd {
	
	
	private
		int sum = 0;
	
	private
		int i;
		int j;

	public
		int data[];
	
	MyAdd() {
		//i = (int)(Math.random()*100);
		j = -4;
	}

	MyAdd(int k, int m) {
		sum = k + m;
	}

	public int add() {
		sum = i + j;
		
		return sum;
		
	}
	public int getSum() {
		
		return sum;
		
	}
	public int get_i() {
		
		return i;
		
	}
	
	public void set_i(int k) {
		this.i = (int)(Math.random()*k);
	}

	public void set_j(int k) {
		j = k;
	}
	
}
