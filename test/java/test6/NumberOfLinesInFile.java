package test6;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.ArrayList;

public class NumberOfLinesInFile {

	public static void main(String[] args) throws IOException {
		

		LineNumberReader lineNumberReader = new LineNumberReader(new FileReader("input.txt"));
		int count=0;
		ArrayList<String> lines=new ArrayList<String>();
		int data = lineNumberReader.read();
		while(data!=-1)
		{
			lines.add(lineNumberReader.readLine());
			data = lineNumberReader.read();
			count++;
			
		}
		
		System.out.println("Count seen is "+count);
		System.out.println("ArrayList Count seen is "+lines.size());
		int i=0;
		while(i<count)
		{
			i=i+10;
			if(i<count)
			{
			System.out.println("Line seen is "+lines.get(i-1));
			}
			
		}
	}

}
