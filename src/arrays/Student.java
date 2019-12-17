package arrays;

import java.util.Scanner;

public class Student {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	String[] student= {"James","John","Adam","Elize","Jamie","Benzema"};
	System.out.println("Please enter the keyword");
	String keyword=input.next();
	for(int i=0;i<student.length;i++) {
		
		if(student[i].contains(keyword)) {
			System.out.println(student[i]+" ");
		}
		}
	}
}

