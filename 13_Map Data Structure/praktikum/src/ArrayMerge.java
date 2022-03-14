import java.util.*;

public class ArrayMerge {

    public static void mergeUnique(String[] array1, String[] array2) {
        Set<String> name = new HashSet<>();
        name.addAll(Arrays.asList(array1));
        name.addAll(Arrays.asList(array2));
        System.out.println(name);

//        String[] tanpaduplikat = new String[name.size()];
//        System.out.println(tanpaduplikat);
//        name.toArray(tanpaduplikat);
//        System.out.println(tanpaduplikat);
//
//        Object[] str3 = name.toArray();
//        System.out.println(Arrays.toString(str3));
    }

    public static void main(String[] args) {
        String[] array1 = {"lee", "jin", "kazuya"};
        String[] array2 = {"kazuya", "panda"};
        mergeUnique(array1, array2);
    }

}
