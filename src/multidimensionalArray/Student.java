package multidimensionalArray;

import java.util.Arrays;

public class Student {
	public static void main(String[] args) {
		String [][] groups=new String[3][];
		
		String [][][] people=new String [2][5][4];
		
	      String[] team3= {"Ada","Tuna"};
	      String[] team2= {"Benzema","Bale","Modric","Kaylor","Marcelo"};
	      String[] team1= {"Can","Han","San","Tan"};
	      
	      groups[0]=team1;
	      groups[1]=team2;
	      groups[2]=team3;
	      
	      System.out.println(Arrays.toString(team2));
	      System.out.println(Arrays.toString(groups[0]));
	      System.out.println(Arrays.toString(groups[1]));
	      System.out.println(Arrays.toString(groups[2]));
	      
	      for (int i=0;i<groups.length;i++) {
	    	  System.out.println(Arrays.toString(groups[i]));
	    	  System.out.println((groups[i].length));
	      }
	    	  
	      
	}
	
}
