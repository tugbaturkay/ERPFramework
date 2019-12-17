package replit;

public class MergeStrings {
	public static void main(String[] args) {
		System.out.println(mergeStrings("wooden","spoon"));
	}
	
	public static String mergeStrings(String one, String two) {
	       String result="";
	     if(one.length()>two.length()){
	       
	       for(int i=0;i<two.length();i++){
	         result+=one.charAt(i)+""+two.charAt(i);
	         }
	         result+=one.substring(two.length());
	         
	     }else if(two.length()>one.length()){
	    for(int i=0;i<one.length();i++){
	         result+=one.charAt(i)+""+two.charAt(i);
	         }
	         result+=two.substring(one.length());
	     }
	      else{
	        for(int i=0;i<one.length();i++){
	         result+=one.charAt(i)+""+two.charAt(i);
	         }
	    }
	    return result;
	  }

}
