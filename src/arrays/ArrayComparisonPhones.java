package arrays;

public class ArrayComparisonPhones {
public static void main(String[] args) {
	String[] phone= {"Iphone","Samsung","LG","Google Pixel","Motorola"};
	String[] phone2= {"Iphone","Samsung","LG","Google Pixel","Motorola"};
	boolean check=false;
	   int a=phone.length;
	   int b=phone2.length;
			  if (a==b) {
				  for(int i=0;i<phone.length;i++) {
						if(!(phone[i].equals(phone2[i]))){
							System.out.println("two are not same");
							check=true;
			
						} 
						
			  } 
				  if(!check) {
						System.out.println("two are same");
					}
	          
				
     }	  
}
}

