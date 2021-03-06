package consoleinput;

import java.util.Scanner;

/*
 * This program takes from standart console count of an array.
 * 
 * Afterwards, an array of integers having even difference but one number is missing 
 * from the array. Missing number is automatically found by the program.
 * 
 * Enter something here:
 * 4
 * 1 3 7 9
 * 
 * evenDiff:2
 * Answer:5
 * 
 * 
 * 
 */
public class GetInputFromConsole {
	
	public static void main(String[] args) {
		
		System.out.println("Enter something here : ");
	    
		   String countStr,arraySTR;
	     
	       Scanner scanIn = new Scanner(System.in);
	       countStr = scanIn.nextLine();
	       
	       int arrayCount = Integer.parseInt(countStr);
	       
	       System.out.println(arrayCount);
	       
	       arraySTR = scanIn.nextLine();
	       
	       
	       String[] parts = arraySTR.split(" ");
	       

	       int[] elements = new int[parts.length];
	       
	       for (int i = 0; i < parts.length; i++) {
			
	    	 elements[i] = Integer.parseInt(parts[i]);
		}
	       
	       for (int i = 0; i < elements.length; i++) {
			System.out.println(elements[i]);
		}

	       
	       int evenDiff = (elements[elements.length-1] - elements[0] ) / arrayCount;
	       
	       
	       System.out.println("evenDiff: "+evenDiff);
	       
	       for (int i = 0; i < (elements.length -1); i++) {
	    	   
	    	   if((elements[i] + evenDiff) != elements[i+1])
	    	   {
	    		   System.out.println("Answer: "+ (elements[i] + evenDiff));
	    	   }
			
		}
	       scanIn.close();            
	       
		
	}

}
