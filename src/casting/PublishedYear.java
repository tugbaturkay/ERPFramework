package casting;

public class PublishedYear {
	public static void main(String[] args) {
		String str="Published on Feb 12,2018";
		int index=str.indexOf(',');
		System.out.println(index);
		String str2=str.substring(index+1);
		System.out.println(str2);
		int year=Integer.valueOf(str2);
		if(year<=2019) {
			System.out.println("Invalid year");
		}else {
			System.out.println("valid year");
		}
		
	}

}
