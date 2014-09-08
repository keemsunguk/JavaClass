package Lesson6;

public class MyQuickSort {
	
	double data[];
	int as;  	//array size
	
	MyQuickSort() {
		data = null;
	}
	
	MyQuickSort(double [] d) {
		data = d;
		as = data.length;
	}
	
	public double[] QuickSort() {
		
		double sdata[] = new double [as];
		
		if(as == 0) {
			System.out.println("No data");
			return null;
		}
		sdata = data.clone();
		qs(sdata, 0, as-1);
				
		return sdata;
	}

	private void qs(double[] d, int left, int right) {
		int i, j;
		double x, y;
		i = left; j = right;
		x = d[(left+right)/2];
		
		do {
			while((d[i] < x) && (i < right)) i++;
			while((x < d[j]) && (j > left)) j--;
			if(i <= j) {
				y = d[i];
				d[i] = d[j];
				d[j] = y;
				i++; j--;
			}
		} while(i <= j);
		
		if(left < j) qs(d, left, j);
		if(i < right) qs(d, i, right);
		
	}
}
