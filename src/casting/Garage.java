package casting;

public class Garage {
	public static void main(String[] args) {
		
		String garage="Toyota,Nissan,Honda,BMW,Mazerati,Ford";
		garage=garage.toLowerCase();
		
		if(garage.isEmpty()) {
			System.out.println("No cars in garage");
		}else {
			if(garage.contains("toyota") || garage.contains("nissan")){
				System.out.println("There is a Japanese car in garage");
			}
				else {
					System.out.println("There is no Japanese car in garage");
				}
			if (garage.contains("bmw")) {
				System.out.println("There is a German car in garage");
			}else {
				System.out.println("There is no German car in garage");
			}
			if (garage.contains("mazerati")) {
				System.out.println("There is a Italian car in garage");
			}else {
				System.out.println("There is no Italian car in garage");
			}
			if (garage.contains("jaguar")) {
				System.out.println("There is a British car in garage");
			}else {
				System.out.println("There is no British car in garage");
			}
		}
			
			
		}
		

	}


