import java.util.*;

public class ArrayUnique {

    private static void gabung(int[]array1, int[] array2) {
        int i;
        int j;
        int x = array1.length;
        System.out.println("jumlah array1 : " + x);
        int y = array2.length;
        System.out.println("jumlah array2 : " + y);

        Set<Integer> array3 = new HashSet<Integer>();
        for (int k : array1) {
            array3.add(k);
        }
        System.out.println(array3);

        for (i = 0; i <= x - 1; i++) {
            for (j = 0; j <= y - 1; j++) {
                if (array1[i] == array2[j]) {
                    array3.remove(array1[i]);
                    System.out.println("besar i :" + i);
                    System.out.println("besar j :" + j);
                    System.out.println(array1[i] == array2[j]);
                    System.out.println("Hasil sementara : " + array3);
                }
            }

            }
            System.out.println("Hasil filter : " + array3);

        }

    public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4};
    int[] array2 = {1, 3, 5, 10, 16};
    gabung(array1,array2);
    }

}
