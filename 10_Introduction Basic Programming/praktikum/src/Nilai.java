import java.util.Scanner;
public class Nilai {
    public static void main(String[] args) {
        int nilai = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coba masukkin nilai : ");
        nilai = scanner.nextInt();

        if(nilai>=80 && nilai <= 100) {
            System.out.println("Nilai Kamu A");
        }
        else if (nilai>=65 && nilai<=79) {
            System.out.println("Nilai Kamu B+");
        }
        else if (nilai>=50 && nilai<=64) {
            System.out.println("Nilai Kamu B");
        }
        else if (nilai>=35 && nilai<=49) {
            System.out.println("Nilai Kamu C");
        }
        else if (nilai>=0 && nilai<=34) {
            System.out.println("Nilai Kamu D");
        }
        else {
            System.out.println("Invalid");
        }
    }


}
