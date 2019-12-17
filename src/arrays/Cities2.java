package arrays;

public class Cities2 {
	public static void main(String[] args) {
		String[] cities= {"Chicago","New York","Madison","Miami","Chicago","Washington"};
		int counter=0;
		boolean check=true;
		for(int i=0;i<cities.length;i++) {
			if(cities[i].equals("Chicago")) {
				check=false;
				System.out.println("Windy city found");
				break;
			}
			
		}
		if(check) {
			System.out.println("Windy city not found");
			
		}
		
		for(int k=0;k<cities.length;k++) {
			if(cities[k].equals("Chicago")) {
				counter++;
			}
		}if(counter!=0) {
			System.out.println("Number of Chicago:" +counter);
		}
			
		
	}

}
