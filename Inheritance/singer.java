package Inheritance;

public class singer extends person{
    public singer(String name) {
        super(name);
    }

    public void singer(){
        System.out.println("I can sing some song");
    }
    public static void laugh(){
        System.out.println("singer is laughing");
    }
}
