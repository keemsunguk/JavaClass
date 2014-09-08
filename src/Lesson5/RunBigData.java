package Lesson5;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import lesson4.StatEx;

public class RunBigData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReadFile readf = new ReadFile();
		
		try{
			File inFile = new File("inp1.txt");
			readf.Readf(inFile);			
			
//			for(int i = 0; i < readf.data_length; i++) {
//				System.out.println(readf.data[i]);
//			}
			
		} catch (IOException e) {
			System.out.println("Reading error...");
			System.out.println(e);
			System.exit(0);
		}
		
		ReadStockData reads = new ReadStockData();
		try{
			File inFile = new File("AMZN.txt");
			int nl = reads.LookAhead(inFile);		//nl = num of lines	
			System.out.println(nl);
			
			inFile = null;
			inFile = new File("AMZN.txt");

			reads.ReadStock(inFile, nl);
			
			ArrayList <StockData> sd = reads.sd;
			int sz = sd.size();
			
			double [] op = new double [sz];
			for(int i = 0; i < sz; i++) {
				op[i] = sd.get(i).open_price;
			}
			
			StatEx myStat = new StatEx(op);
			System.out.format("The Minimum is: %5.2f\n", myStat.getMin());   //hw 5
			System.out.format("The Maximum is: %5.2f\n", myStat.getMax());	 //hw 5
			System.out.format("The sum is: %5.2f\n", myStat.getSum());
			System.out.format("The Mean is: %5.2f\n", myStat.getMean());			
			System.out.format("The Stdev is: %5.2f\n", myStat.getStdev());
			
			
		} catch (IOException e) {
			System.out.println("Reading error...");
			System.out.println(e);
			System.exit(0);
		}
		
	
	}

}
