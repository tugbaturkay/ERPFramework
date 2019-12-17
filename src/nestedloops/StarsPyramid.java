package nestedloops;

public class StarsPyramid {
	public static void main(String[] args) {
		int rc=5, spaceCounter=7, starCounter=1;
	    for (int i=1;i<=8;i++){
	      System.out.println();
	        
	        for(int j=1;j<=spaceCounter;j++){
	        System.out.print(" ");
	        }
	        for (int k=1;k<=starCounter;k++){
	          System.out.print("*");
	          
	          
	        }
	          spaceCounter--;
	          starCounter=starCounter+2;
	}
	    
		   
		       
}
}
	
		        
		      
		      


