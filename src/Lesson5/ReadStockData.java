package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadStockData {
	ReadStockData() {
		
	}

	
	public StockData [] sd;
	
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
		
		sd = new StockData[totalNo];
		String dummy = null;
		int i = 0;
		
		while( (dummy = reader.readLine()) != null) {
			String [] str = dummy.split(" ");
			sd[i].date =str[0];
			sd[i].open_price = Double.valueOf(str[1]);
			sd[i].close_price = Double.valueOf(str[2]);
			sd[i].low = Double.valueOf(str[3]);
			sd[i].high = Double.valueOf(str[4]);
			i++;
		}
		
		reader.close();		
		
	}
}
