package consoleinput;

import java.util.Scanner;

public class JavaOutputFormatting {
	
	/*
     * 	java 100
		cpp 65
		python 50
     */

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        
        System.out.println("================================");
        for(int i=0;i<3;i++)
        {
            String s1=sc.next();
            int x=sc.nextInt();
            System.out.printf("%-15s",s1);    
            System.out.printf("%03d",x);    
            System.out.println();
            //Complete this line
        }
        System.out.println("================================");

}
        
        
       
        
         
}
