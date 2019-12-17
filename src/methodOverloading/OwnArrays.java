 package methodOverloading;

public class OwnArrays {
	public static void main(String[] args) {
		String []word= {"hi","ok","bye"};
		System.out.println(toString(word));
	}
	public static String toString(String [] words){
		
		String result="[";
		for(int i=0;i<words.length;i++) {
			if(i==words.length-1) {
				result+=words[i]+"]";
			}else {
				result+=words[i]+", ";
			}
		}
		return result;
	
	}
public static String toString(int [] numbers){
		
		String result="[";
		for(int i=0;i<numbers.length;i++) {
			if(i==numbers.length-1) {
				result+=numbers[i]+"]";
			}else {
				result+=numbers[i]+", ";
			}
		}
		return result;
	
	}

}
