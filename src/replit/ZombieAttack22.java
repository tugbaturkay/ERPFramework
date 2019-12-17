package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack22 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	     
	    } 
	    
int sum = 0, day = 1;
             
	    System.out.println("Day "+ (day - 1) + " " + Arrays.toString(inhabitants));
		do {
			sum = 0;
				for(int i = 0; i < inhabitants.length-1; i++) {
					if(inhabitants[i+1]==0) {
						inhabitants[i]/=2;
						continue;
					}else if(inhabitants[i]==0) {
						inhabitants[i+1]/=2;
						i++;
						continue;
					}
				}
					for (int i=0;i<inhabitants.length;i++) {
						sum += inhabitants[i];	
					}
					
				
				System.out.println("Day "+ day + " " + Arrays.toString(inhabitants));
			day++;
		}while(sum != 0);
		System.out.println("---- EXTINCT ----");
	    
}

}
