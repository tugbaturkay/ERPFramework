package methods;

public class Calculator {
  public static void main(String[] args) {
	int operation=add(2,3);
	System.out.println(operation);
	int operation2=multiply(2,3);
	System.out.println(operation2);
	System.out.println(divide(12,4));
}
  public static int add(int a,int b) {
	  int result=a+b;
	  return result;
  }
  public static int subtract(int a,int b) {
	  int result=a-b;
	  return result;
  }
  public static int multiply(int a,int b) {
	
	  return a*b;
  }
  public static int divide(int a,int b) {
	  int result=a/b;
	  return result;
  }
}
