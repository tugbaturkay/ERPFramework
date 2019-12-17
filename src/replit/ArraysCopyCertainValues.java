package replit;

import java.util.Arrays;

public class ArraysCopyCertainValues {
	public static void main(String[] args) {
	    System.out.println("-----EXAMPLE RUN ---------");
	    String[] numbers = {"zero", "one", "two","three","four"};
	  
	    System.out.println(Arrays.toString(getWithE(numbers)));
	   
	    
	  }
	  
	  
	  
	  public static String[] getWithE(String[] arr) {
	    int counter =0;
	    //TODO : YOUR CODE GOES HERE ----------------------
	    
	    for(int i = 0; i < arr.length; i++)
	{
	  if(arr[i].contains("e")){
	   counter++;
	  }
	} 
	String [] fewValues = new String [counter];//3
	  int index = 0;
	for(int i = 0; i < arr.length; i++){
	  if(arr[i].contains("e")){
	    fewValues[index]= arr[i];
	    index++;
	  }
	}
	    
	    //YOUR CODE ENDS HERE -----------------------
	    
	    return fewValues;
	  }
	  

}
