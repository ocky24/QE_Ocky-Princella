// sudah aman
import java.util.Scanner;
public class bilangan2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int input;

            System.out.println("Masukkan nilainya : ");
            input = scanner.nextInt();

            for(int i=input; i>=1;i-- ) {
                if(input%i == 0 ) {
                    System.out.println(i);
                }
            }
        }
}






