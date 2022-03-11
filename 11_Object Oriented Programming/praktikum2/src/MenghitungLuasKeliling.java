public class MenghitungLuasKeliling {
    private static double luasPersegi(int a) {
        double rumus = (double) (a * a);
        return rumus;
    }

    private static double luasSegitiga(int alas, int tinggi) {
        double rumus = (double) (alas * tinggi / 2);
        return rumus;
    }

    private static double luasPP(int p, int l) {
        double rumus = (double) (p * l);
        return rumus;
    }

    private static double kelPersegi(int a) {
        double rumus = (double) (4 * a);
        return rumus;
    }

    private static double kelSegitiga(int alas, int tinggi) {
        double sisimiring = Math.sqrt(Math.pow((double) (alas / 2), 2.0D) + Math.pow((double) tinggi, 2.0D));
        double rumus = 2.0D * sisimiring + (double) alas;
        return rumus;
    }

    private static double kelPP(int p, int l) {
        double rumus = (double) (2 * p + 2 * l);
        return rumus;
    }

    public static void main(String[] args) {
        double persegi = luasPersegi(4);
        double segitiga = luasSegitiga(3, 4);
        double pp = luasPP(7, 8);
        double kpersegi = kelPersegi(4);
        double ksegitiga = kelSegitiga(3, 4);
        double kpp = kelPP(7, 8);
        System.out.println("output Luas : ");
        System.out.println("Luas persegi adalah : " + persegi);
        System.out.println("Luas segitiga adalah : " + segitiga);
        System.out.println("Luas persegi panjang adalah : " + pp);
        System.out.println("output keliling : ");
        System.out.println("keliling persegi adalah : " + kpersegi);
        System.out.println("keliling segitiga adalah : " + ksegitiga);
        System.out.println("keliling persegi panjang adalah : " + kpp);


    }
}
