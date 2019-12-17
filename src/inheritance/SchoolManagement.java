package inheritance;

public class SchoolManagement {

    public static void main(String[] args) {
        InClassStudent s1=new InClassStudent();
        OnlineStudent s2=new OnlineStudent();

        s1.name="James";
        s1.takeExam(85);
        System.out.println(s1.grade);
    }



}
