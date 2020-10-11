package Inheritance;

public class singletonClass {
    private singletonClass(){

    }
    //private static singletonClass obj = new singletonClass();
    private static singletonClass obj = null;
    public static singletonClass getInstance(){
        if (obj == null){
            obj = new singletonClass();
        }
        return obj;
    }
}
