package inheritance;

public class Student {
    String name;
    int age;
    String location;
    char grade;

    public void Study(String course){
        System.out.println("Studying " + course);
    }
    public void takeExam(int number){
        if(number>=90){
            this.grade='A';
        }else if (number>=80 && number<90){
            this.grade='B';
        }else if(number>=70 && number<80){
            this.grade='C';
        }else if(number>=60 && number<70){
            this.grade='D';
        }else if(number<60 ){
            this.grade='F';
        }

    }



}
