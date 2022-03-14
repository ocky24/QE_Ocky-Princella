import java.util.*;

public class AngkaMunculSekali {

    public static void  uniquenumber(String array) {


        String[] c = {};
        c = array.split("");
        Collection<String> angka = new ArrayList<>();
        angka.addAll(Arrays.asList(c));

        System.out.println("ini hasil untuk angka pertama" + angka);

        for (int i = 0; i < c.length-1; i++) {
            for (int j = i+1; j < c.length; j++) {

                System.out.println("Percobaan untuk i ke "+i+" dan j ke " +j);
                if (c[i].compareTo(c[j])==0) {

                    System.out.println(c[i]);
                    System.out.println(c[j]);

                    angka.remove(c[i]);
                    angka.remove(c[j]);
                }
            }
        }
        System.out.println("Angka yang unik adalah: " + angka);
    }

    public static void main(String[] args) {
        String angka = "1122";
        uniquenumber(angka);
    }




}
