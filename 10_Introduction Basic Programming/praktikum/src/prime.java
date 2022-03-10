import java.util.Scanner;
public class prime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan angka yang ingin dicek: ");
        int num = scanner.nextInt();

        boolean kondisi = false;
        for (int i = 2; i <= num / 2; ++i) {
            // kondisi untuk bilangan non prima
            if (num % i == 0) {
                kondisi = true;
                break;
            }
        }
        if (!kondisi)
            System.out.println(num + " adalah bil. Prima");
        else
            System.out.println(num + " bukan bil. prima");
    }
}