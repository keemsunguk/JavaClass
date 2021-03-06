package lesson4;

//import java.io.*;
/*
 * private:  Own class
 * protected:  Own and subclasses (inheritance) + package
 * default: package
 * public: all 
 */
public class StatEx {
	private	double resSum = 0.0;
	private	double resMean = 0.0;
	private	double resStdev = 0.0;
	private double data[];	
	private int as = 0;
	
	StatEx() {
		data = null;
		as = 0;
	}
	
	public StatEx(double d[]) {
		data = d;
		as = data.length;
	}
	
	public double getSum() {
		double sum = 0;
		if(data == null) return sum;
		
		for (int i = 0; i < as; i++) {
			sum = sum + data[i];
		}
		resSum = sum;
		return resSum;
	}
	
	public double getMean() {
		resMean = resSum/(double)as;
		return resMean;
	}

	public double getStdev() {
		//pre-variance is sum of (array-mean)^2
		double prevariance = 0;
		for (int i = 0; i < as; i++) {
			prevariance = Math.pow(data[i] - resMean, 2) + prevariance;
		}
		//variance is sum((array-mean)^2)/array length
		double variance = prevariance/as;
		resStdev = Math.sqrt(variance);

		return resStdev;
	}
	
	public double[] sortData() {
		double sdata[] = new double [as];
		
		if(as == 0) {
			System.out.println("No data");
			return null;
		}
//		sdata = data;
		sdata = data.clone();
		// This is the Bubble sort.
		
		
		for(int a=1; a < as; a++) {
			for(int b = as-1; b >= a; b--) {
				if(sdata[b-1] > sdata[b]) { // if out of order
					// exchange elements
					double t = sdata[b-1];
					sdata[b-1] = sdata[b];
					sdata[b] = t;
				}
			}
		}
		
		return sdata;
	}
	
	public double getMin() {
		double min = Double.MAX_VALUE;
		
		
		for (int i = 0; i < as; i++) {
		    if (data[i] < min) min = data[i];
		}
		
		return min;
	}

	public double getMax() {
		double max = Double.MIN_VALUE;
		
		
		for (int i = 0; i < as; i++) {
		    if (data[i] > max) max = data[i];
		}
		
		return max;
	}
}
