package multidimensionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class MyGroup2 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter number of groups");
	int NumOfGroup=input.nextInt();
	input.nextLine();
	String [][] groups=new String[NumOfGroup][];
	
	for(int i=0;i<NumOfGroup;i++) {
		System.out.println("Please enter number of students for group " +(i+1));
		int size=input.nextInt();
		input.nextLine();
		String[]group=new String[size];
		for(int j=0;j<size;j++) {
			System.out.println("please enter student name"+ (j+1));
			group[j]=input.nextLine();
			
		}groups[i]=group;
	}
	System.out.println(Arrays.deepToString(groups));
	
	
}

}

