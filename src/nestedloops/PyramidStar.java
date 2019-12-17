package nestedloops;

public class PyramidStar {
	public static void main(String[] args) {
		
		for(int i=1; i<=8; i++) {
			System.out.println();
			
			
			for(int j=7; j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=15;k++) {
			
					System.out.print("*");
				}	
				
			}
			
		}
	}

