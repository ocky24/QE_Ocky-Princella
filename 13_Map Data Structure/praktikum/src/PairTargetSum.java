import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class PairTargetSum {


    private static void pairTarget(int[] input,int target){
     int i = 0;
     int j = 0;
     int x = input.length;
     int hasil;
     for (i=0; i<x ; i++ ){
         for(j=i+1; j<x;j++){
             hasil = input[i]+input[j];
                if(hasil == target){
                    System.out.println("besar i: " + i);
                    System.out.println("besar j: " + j);
                    int[] array = {i,j};

                    Set<Integer> arrayhasil = new HashSet<Integer>();
                    for (int k : array){
                        arrayhasil.add(k);
                    }
                    System.out.println("Maka indeks yang menghasilkan penjumlahan sesuai target adalah: " + arrayhasil);
                    System.out.println("yakni angka :"+ input[i]+ " dan angka :" + input[j]);
                    System.out.println("Target: "+ target);
//        System.out.println("Maka indeks yang menghasilkan penjumlahan sesuai target adalah: "+ array);
                    break;
                }
         }
     }


    }


    public static void main(String[] args) {
        int[] input = {2, 5, 9, 11};
        int target = 11;
        pairTarget(input,target);
    }


}
