package SB;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Palindrome {
    public static void main(String[] args) {
        String word="civic";
        System.out.println(Palindrome(word));
        System.out.println(removeCon("convert"));
    }
    public static void insertHello(ArrayList<String> list, String target){
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()==2){
                StringBuilder sb=new StringBuilder(list.get(i));
                sb.insert(1,target);
                list.set(i,sb.toString());
            }
        }
        System.out.println(list);
    }
    public static void insertHello(ArrayList<String> list){
        for(int i=0;i<list.size();i++){
            if(list.get(i).length()==2){
                StringBuilder sb=new StringBuilder(list.get(i));
                sb.insert(1,"hello");
                list.set(i,sb.toString());
            }
        }
        System.out.println(list);
    }
    public static String removeWord(String word,String target){
        if (word.length()<3){
            System.out.println("Invalid data");
            return "";
        }
        else if (word.trim().contains(" ")){
            System.out.println("Invalid data");
            return "";
        }
        else if (!word.contains(target)){
            System.out.println("Invalid data");
            return word;
        }
        else {
            StringBuilder sb = new StringBuilder(word);
            sb.delete(sb.indexOf(target), sb.indexOf(target) + target.length());
            return sb.toString();
        }
    }
    public static String removeCon(String word){
       if (word.length()<3){
           System.out.println("Invalid data");
           return "";
       }
       else if (word.trim().contains(" ")){
           System.out.println("Invalid data");
           return "";
       }
       else if (!word.contains("con")){
           System.out.println("Invalid data");
           return word;
       }
       else{
           StringBuilder sb=new StringBuilder(word);
           sb.delete(sb.indexOf("con"),sb.indexOf("con")+3);
           return sb.toString();
       }



    }

    public static boolean Palindrome(String word){
        StringBuilder sb=new StringBuilder(word);
         String reverse= sb.reverse().toString();
        if(reverse.equals(word)){
            return true;
        }
        return false;
    }
}
