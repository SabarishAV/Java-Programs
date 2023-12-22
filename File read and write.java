// NOTE : You need input.txt and output.txt to run this code without error

import java.io.*;

public class Main
{
	public static void main(String[] args) {
		String input = "input.txt";
		String output = "output.txt";
		try{
		    BufferedReader reader = new BufferedReader(new FileReader(input));
		    BufferedWriter writer = new BufferedWriter(new FileWriter(output));
		    String line;
		    while((line=reader.readLine())!=null){
		        writer.write(line);
		        writer.newLine();
		    }
		    System.out.println("File reading and writing completed successfully");
		}catch(FileNotFoundException e){
		    System.out.println("File not found "+e.getMessage());
		}catch(IOException e){
		    System.out.println("An error occured while reading or writing file "+e.getMessage());
		}
	}
}
