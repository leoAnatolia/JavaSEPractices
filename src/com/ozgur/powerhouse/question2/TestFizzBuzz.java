package com.ozgur.powerhouse.question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestFizzBuzz {

	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        
        
        
        //final String fileName = System.getenv("OUTPUT_PATH");
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));
        
        String res;
        int _untilVal;
        _untilVal = Integer.parseInt(in.nextLine().trim());
        
       res = FizzBuzz(_untilVal);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }

	private static String FizzBuzz(int _untilVal) {

		StringBuffer sb = new StringBuffer();
		
		for (int i = 1; i < _untilVal + 1; i++) {
			
			
			if( (i % 15) == 0 )
			{
				sb.append("FizzBuzz\n") ;
			}
			
			else
			
			if( (i % 5) == 0 )
			{
				sb.append("Buzz\n") ;
			}
			
			else
			if( (i % 3) == 0)
			{
				sb.append("Fizz\n") ;
			}
			
			
			else
			{
				sb.append(i+"\n") ;
			}
		}

		return sb.toString();
		
	}
}


