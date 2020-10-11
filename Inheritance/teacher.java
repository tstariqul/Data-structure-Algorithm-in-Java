package Inheritance;

public class teacher extends person{
    public teacher(String name){
        super(name);
        System.out.println("Inside teacher constructor");
    }
    public void learn(){
        super.walk();
        System.out.println("Learn now in diu");
    }
    public void walk(){ //method overriding
        System.out.println("He can "+name+ " walking in wall");
    }
    public static void laugh(){
        System.out.println("techer is laughing");
    }
}
