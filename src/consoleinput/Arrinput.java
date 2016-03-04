package consoleinput;

import java.io.CharArrayReader;
import java.io.IOException;

public class Arrinput {
	
	public static void main(String[] args) {
		String object = "abcdefgh";
		
		
		int objectLength = object.length();
		
		char c[]=new char[object.length()];
		
		object.getChars(0, objectLength, c,	 0);
		
		CharArrayReader input1 = new CharArrayReader(c);
		CharArrayReader input2 = new CharArrayReader(c,1,4);
		
		int i;
		int j;
		
		try {
			while((i=input1.read())==(j=input2.read())){
				System.out.println((char)i);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
	
	
	

}
