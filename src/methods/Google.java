package methods;

public class Google {
	public static void main(String[] args) {
		String result="About 26,000,000 results (0.60 seconds)";
	    String count=resultCount(result);
	    System.out.println(count);
	    
	    String c=resultCount("About 2,880,000,000 results (0.95 seconds) ");
	    System.out.println(c);
	    String d=resultTime("About 2,880,000,000 results (0.95 seconds) ");
	    System.out.println(d);
	}
	public static String resultCount(String res) {
		
		String []words=res.split(" ");
		String s=words[1];
		s=s.replace(",","");
		return s;
	}
	public static String resultTime(String res) {
		int i=res.indexOf('(');
		int j=res.indexOf(')');
		String s=res.substring(i+1,j);
		return s;
	}

}
