package cp;


import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, j=0;
        while(n-- >0){
            int k = sc.nextInt();
            if(k>=10&&k<=20){
                i++;
            }
            else{
                j++;
            }

        }
        System.out.println(i+" in\n"+j+" out\n");



    }

}