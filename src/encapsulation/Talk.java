package encapsulation;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Talk {
	public static void main(String[] args) {
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
				Date date = new Date();
				String dateStr = dateFormat.format(date);
				System.out.println(dateStr);
				
		//IPhone iphone=new IPhone();
		//iphone.model="XS";
		//iphone.setMemory(256);
		//iphone.info();
		
//		Person p1=new Person();
//		p1.setName("James Bond");
//		p1.setAge(25);
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		p1.info();
//		p1.setGender("male");
//		Person.getHairCut(p1);
//		Person.getMarried(p1, p1);
//		Person p2=new Person();
//		p2.setGender("female");
//		p2.setAge(21);
//		Person.getMarried(p1, p2);
	}

}
