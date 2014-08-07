package Lesson5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

	ReadFile() {
		
	}
	
	public double data[];
	public int data_length;
	
	public void Readf(File inf) throws IOException {
		
		BufferedReader reader = new BufferedReader (new FileReader(inf));
		
		int line_count = 0;
		String dummy = null;
		String[] strInt = null;
		
		while( (dummy = reader.readLine()) != null) {
			line_count++;
			strInt = dummy.split(" ");
			}
		
		data_length = strInt.length;
		data = new double [data_length];
		
		for(int i = 0; i < data_length; i++) {
			data[i] = Double.valueOf(strInt[i]);
		}
		reader.close();
		
	}
	
}
