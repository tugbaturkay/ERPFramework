package methods;

import java.util.Arrays;

public class MethodPractice {
	public static void main(String[] args) {
		int []nums= {1,2,3};
		System.out.println(checkArray(nums,1));
		String [] words= {"hi","hello","merhaba"};
		String [] newWords=addItem(words,"selam");
		System.out.println(Arrays.toString(newWords));
		String [] newWords2=addItemIndex(words,"selam",1);
		System.out.println(Arrays.toString(newWords2));
	}
	public static String[] addItemIndex(String [] arr, String newItem,int index) {
		String []newArr=new String[arr.length+1];
		
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		newArr[index]=newItem;
		return newArr;
	}
	public static boolean checkArray(int [] arr,int number){
		for(int i=0;i<arr.length;i++) {
			if(number==arr[i]) {
				return true;
			}
			
		}return false;
	}
	
	public static String[] addItem(String [] arr, String newItem) {
		String []newArr=new String[arr.length+1];
		for(int i=0;i<arr.length;i++) {
			newArr[i]=arr[i];
		}
		newArr[newArr.length-1]=newItem;
		return newArr;
	}
	

}
