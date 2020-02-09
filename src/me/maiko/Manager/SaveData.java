package me.maiko.Manager;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SaveData {
	

	
	public static File file = new File("Data/SaveData.txt");
	
	
	public static boolean isExists() {
	return file.exists();
	}
	public static void createSaveData() {
		try {
			file.createNewFile();
	
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	
	}

	////////////////////////////////////////////////////////////////*
	

	


	@SuppressWarnings("resource")
	public static void WriteLine(String text) {
		
		
		try {
			
			   FileWriter writer = new FileWriter(file ,true);

			BufferedReader reader= new BufferedReader(new FileReader(file));
			String line = reader.readLine();
			
			while(line != null) {
				line = reader.readLine();
				
			}

			if(line ==null) {

				writer.write(text);
		        writer.write(System.getProperty("line.separator"));
				writer.flush();
		        writer.close();
				}
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
	}

	
	
	
	
	
	
	
	
	
////////////////////////////////////////////////////////////////////////////	
	

	
	public static String get(String data) {
	

		try {
			  @SuppressWarnings("resource")
			BufferedReader reader= new BufferedReader(new FileReader(file));
			
		ArrayList<String> content = new ArrayList<>();
	

			String line = reader.readLine();

			while(line != null) {
				content.add(line);
				line = reader.readLine();
			}
			if(line == null) {
				for(String s: content) {
					if(s.startsWith(data)) {
						
						return s.substring(data.length());
					}
				}
				
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		
	return "nix";	
	}
	
	

	

	

	
	
	
	

	
	
}
