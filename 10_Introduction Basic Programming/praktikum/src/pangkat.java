// sudah aman
import java.util.Scanner;
public class pangkat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan nilai x : ");
        int x = scanner.nextInt();

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Masukkan nilai n : ");
        int n = scanner2.nextInt();

        int hasil=x;
        int z = 1;
        int i;

        for (i = 1; i < n; i++) {
            hasil = (hasil * x);
//            System.out.println("pengulangan ke " + i + " nilai x nya : " + hasil);
        }
        System.out.println("Hasil x pangkat n adalah = " + hasil);
//        System.out.println(i);
//        System.out.println(x);
//        System.out.println(n);
    }
}


