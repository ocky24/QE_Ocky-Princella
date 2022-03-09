import java.util.Scanner;
public class Faktor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input=0 ;

        System.out.println("Masukkan nilainya : ");
        input = scanner.nextInt();


        for(int i=1; i<=input;i++ ) {
            if(input%i == 0 ) {
                System.out.println(i);
            }

        }

    }


}
