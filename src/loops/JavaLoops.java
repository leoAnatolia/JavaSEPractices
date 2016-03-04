package loops;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		int testCount = sc.nextInt();
		
		System.out.println();
		
		for (int i = 0; i < testCount; i++) {
			
			String line = sc.nextLine();
			
			System.out.println(line);
		}
	
	
	}

}
