package Inheritance;

public class person {
    protected String name;
    public person(String name){
        this.name = name;
        System.out.println("Inside person constructor");
    }
    public void walk(){
        System.out.println(name+" is walking now");
    }
    public void sleep(){
        System.out.println(name+" sleep at night");
    }
    public static void laugh(){
        System.out.println("person is laughing");
    }

}
