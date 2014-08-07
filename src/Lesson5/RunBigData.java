package Lesson5;

import java.io.File;
import java.io.IOException;

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
			int nl = reads.LookAhead(inFile);			
			System.out.println(nl);
			
			StockData [] sd = reads.sd;
			
		} catch (IOException e) {
			System.out.println("Reading error...");
			System.out.println(e);
			System.exit(0);
		}
		
	
	}

}
