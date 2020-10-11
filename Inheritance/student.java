package Inheritance;

public class student extends person{
    public student(String name) {
        super(name);
    }

    public void book(){
        System.out.println("My book name is IELTS 3");
    }
    public static void laugh(){
        System.out.println("student is laughing");
    }
}
