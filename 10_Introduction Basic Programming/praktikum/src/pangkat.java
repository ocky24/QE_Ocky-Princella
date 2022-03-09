
//cape deh

import java.util.Scanner;
public class pangkat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai x : ");
        int x = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner2.nextInt();

        int hasil;
        int z = 1;
        int rumus;
        int i;
        for (i = 1; i < n; i++) {
            hasil = (x * x);
            System.out.println("Hasil x pangkat n adalah = " + hasil);
        }

    }
}
