// sudah aman
import java.util.Scanner;

public class palindrome {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan kata : ");
        String kata = scanner.nextLine();
        char[] extracthuruf = kata.toCharArray();
        int x = kata.length();
        int i;
        int a = 0;
        for(i =0; i<=x/2; i++ ) {
            if (extracthuruf[i] == extracthuruf[x-i-1]) {
            System.out.println("Kata ke : " + i + " sama");
            a = a+1;
             }
         }
        if (a-1 == x/2) {
            System.out.println("Palindromee");
        }
        else System.out.println("Bukan Palindromee");


        System.out.println( extracthuruf[0]);
        System.out.println( x);
        System.out.println( a);
    }


    }

