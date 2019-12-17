package encapsulation;

public class Person {
	private String name;
	private String gender;
	private int age;
	private double height;
	private double weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("male")) {
			this.gender = gender;
		}else {
			System.out.println("invalid gender");
		}
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>=0 && age<=120) {
			this.age = age;
		}else {
			System.out.println("invalid age");
		}
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		if (height>0) {
			this.height = height;
		}else {
			System.out.println("invalid height");
		}
		
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		if (weight>0) {
			this.weight = weight;
		}else {
			System.out.println("invalid weight");
		}
		
	}
	
	public void info() {
		System.out.println("Person Information");
		System.out.println("Name: "+ this.name);
		System.out.println("Gender: "+ this.gender);
		System.out.println("Age: "+ this.age);
		System.out.println("Height: "+ this.height);
		System.out.println("Weight: "+ this.weight);
	}
	
	public static void getHairCut(Person person) {
		if(person.gender.equalsIgnoreCase("male")) {
			System.out.println(person.name + " is getting haircut at Men's Barbershop");
		}else if (person.gender.equalsIgnoreCase("female")) {
			System.out.println(person.name + " is getting haircut at Women's Barbershop");	
		}else {
			System.out.println("not able to get haircut");
		}
	}
	
	public static void getMarried(Person p1,Person p2) {
		if(p1.age>=18 && p2.age>=18) {
			if(!p1.gender.equals(p2.gender)) {
				System.out.println("Valid marriage");
				
			}else {
				System.out.println("Invalid marriage");
			}
		}else {
			System.out.println("Too young to get married");
		}
	}

}
