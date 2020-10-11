package oop;

public class exaptionHandaling {
    public static void main(String[] args) {
        try {
//            int a= 5;
//            int b = 0;
//            int c = a/b;
//            System.out.println(c);
            int arr[] = new int[5];
            System.out.println(arr[6]);
        }
        catch (ArithmeticException see){
            System.out.println(see.getMessage()+" occured please check");
        }
        catch (ArrayIndexOutOfBoundsException see){
            System.out.println(see.getMessage() + " index outof bound");
        }
        catch (IllegalArgumentException see){
            System.out.println(see+ " Illegal statement");
        }
        finally {
            System.out.println("Sorry for that");
        }
    }
}
