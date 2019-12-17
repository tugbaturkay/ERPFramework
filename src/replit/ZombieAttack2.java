package replit;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    int[] inhabitants = new int[8];
	    for(int i=0; i<inhabitants.length; i++) {
	      inhabitants[i] = input.nextInt();
	     
	    } 

	int counter = 0;
	boolean zero;
	do {
	zero = true;
	System.out.println("Day " + counter + Arrays.toString(inhabitants));
		for(int i = 0; i < inhabitants.length; i++ ) {
			if(i==7 && inhabitants[i]==0) {
				inhabitants[i-1]/=2;
			}else if(i==0 && inhabitants[i]==0) {
				inhabitants[i+1]/=2;
			}
			if (inhabitants[i]==0) {
			inhabitants[i-1]/=2;
			inhabitants[i+1]/=2;
			zero = false;
			}

		}
		
		counter++;	



	}while (!zero);

	}
}


