package StringsProb;
import java.util.Scanner;

public class anagramsNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String b = input.nextLine();
        int arr[] = new int[256];
        boolean isAnagram = true;

        for (char see: a.toCharArray()){
            int index = (int) see;
            arr[index]++;
        }
        for (char now: b.toCharArray()){
            int index = (int) now;
            arr[index]--;
        }
        for (int i = 0; i<256; i++){
            if (arr[i] != 0){
                isAnagram = false;
                break;
            }
        }
        if (isAnagram){
            System.out.println("It is Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}
