package loops;

import java.util.Random;

public class UniqueNumber {
public static void main(String[] args) {
	Random r=new Random();
	String result="";
	for(int i=0;i<6;i++) {
		int ii=r.nextInt(10);
		while(result.contains(ii+"")){
			ii=r.nextInt();
		}
		result+=ii;	
	}
	System.out.println(result);
}
}
