import java.util.ArrayList;
import java.util.Arrays;
import  java.util.Collection;
import java.util.Collections;


//cuma bisa buat yg 3 angka aja
public class MAxSum{

    public static void max(int k, int[] input){

    int x = input.length;
    System.out.println("nilai x : " + x);
    int c = 1;
    int[] hasil = new int[x];
    System.out.println("nilai k : " + k);

    for (int i=0; i<=x-k; i++){
        hasil[c] = (input[i]+input[i+1]+input[i+2]);
        System.out.println("nilai i: " + i + " terdiri atas angka : "+ input[i]+input[i+1]+input[i+2]);
        System.out.println(" Percobaan ke " + c + " hasilnya = "+ hasil[c]);
        c = c +1;
        }

    //cek mana yang paling besar
        int simpanhasil = hasil[1];
        for (c=1; c<=x-k; c++){
            if (simpanhasil > hasil[c+1])
            {
            simpanhasil = simpanhasil;
            }
            else simpanhasil = hasil[c+1];
        }
        System.out.println("Hasil dari 3 angka berurutan yang terbesar adalah : "+ simpanhasil);

    }

    public static void main(String[] args) {
        int k = 3;
        int[] input = {2,1,5,1,3,2};
        max(k,input);
    }



}
