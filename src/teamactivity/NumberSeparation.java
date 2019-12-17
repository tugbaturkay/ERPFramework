package teamactivity;

import java.util.Arrays;

public class NumberSeparation {

	public static void main(String[] args) {
		String str="sr%73ir4in*f3tg23";
		System.out.println(Arrays.toString(extractNum(str)));

	}
		public static String[] extractNum(String str) {
			String s="";
			for(int i=0;i<str.length();i++) {
				if(str.charAt(i)>47 && str.charAt(i)<58) {
					s+=str.charAt(i)+",";
				}
			}
			String nums[]=s.split(",");
			return nums;
//			for(int i=0;i<s.length();i++) {
//				int[] numsFinal=Integer.valueOf(s[i]);
//			}
		}

	}


