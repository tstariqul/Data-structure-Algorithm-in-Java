package maths;
import java.util.*;

public class primeNum {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = true;
        for (int i=2;i*i<=n ;i++){
            if (n%i == 0){
                isPrime = false;
                break;
            }
        }
        if(n<2){
            isPrime = false;
        }
        System.out.println("Number is:"+isPrime);
    }
}
