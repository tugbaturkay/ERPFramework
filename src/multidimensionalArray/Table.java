package multidimensionalArray;

public class Table {
	public static void main(String[] args) {
		//String text="bla bla";
		//int maxLength=3;
		System.out.println(limit("abcd",2));
		System.out.println(at3("floor","kk"));
	}
	public static String limit(String text, int maxLength)
	  {
	    text=text.replace(" ","");
	    text=text.trim();
	    int i=text.length()-maxLength;
	    text=text.substring(0,i);
	    return text;
	  }
	
	 public static String at3(String target,String word)
	  {
	    String at3="";
	  String str1=target.substring(0,3);
	  String str2=target.substring(3);
	at3=str1+word+str2;
	  return at3;
	    
	  }

}
