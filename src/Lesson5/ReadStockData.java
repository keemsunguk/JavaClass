package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadStockData {

	ArrayList <StockData> sd;
	
	ReadStockData() {
		sd = null;
	}

	
	/*
	 * count number of line in the input file
	 */
	public int LookAhead(File inf) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader(inf));
		
		int line_count = 0;
		String dummy = null;
		
		while( (dummy = reader.readLine()) != null) {
			line_count++;
		}
		
		reader.close();		
		return line_count;
	}
	
	public void ReadStock(File inf, int totalNo) throws IOException {
		BufferedReader reader = new BufferedReader (new FileReader(inf));
		
		
		String dummy = null;
		//int i = 0;
		
		sd = new ArrayList<StockData>();
		
		while( (dummy = reader.readLine()) != null) {
			String [] str = dummy.split(" ");
			StockData temp = new StockData();
			temp.date =str[0];
			temp.open_price = Double.valueOf(str[1]);
			temp.close_price = Double.valueOf(str[2]);
			temp.low = Double.valueOf(str[3]);
			temp.high = Double.valueOf(str[4]);
			
			sd.add(temp);
			
			//i++;
		}
		
		reader.close();		
		
	}
}
