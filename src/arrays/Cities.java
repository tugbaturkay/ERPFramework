package arrays;

import java.util.Arrays;

public class Cities {
	public static void main(String[] args) {
		String[] cities= {"Chicago","New York","Madison","Miami","Washington"};
		   boolean check=true;
   int counter=0;
		     for(int i=0; i<cities.length; i++) {
	   if(cities[i].equals("Chicago")) {
		  System.out.println("Windy city found");
		  counter++;
		  check=false;
		  System.out.println(counter);
		  break;
	  }
  } if (check) {
	  System.out.println("Windy city not found");
  }
  
	}
	   
}
