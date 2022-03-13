import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;


public class RemoveDuplicate {

    public static void remove(String[] input){
        Set<String> angkabaru = new HashSet();

        angkabaru.addAll(Arrays.asList(input));
        Object[] hasil = angkabaru.toArray();
        System.out.println("Array tanpa duplikat: " + Arrays.asList(hasil));
        System.out.println("jumlahnya ada :" + angkabaru.size());
        }


    public static void main(String[] args) {
        String[] input = {"2","2", "2", "11"};
        remove(input);
    }

}
