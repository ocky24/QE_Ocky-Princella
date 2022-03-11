public class Menghitungvolume {
    private static Double vKubus(int a) {
        double rumus = (double)(a * a * a);
        return rumus;
    }

    public static Double vBalok(int p, int l, int t) {
        double rumus = (double)(p * l * t);
        return rumus;
    }

    private static Double vTabung(int r, int tinggi) {
        double luaslingkaran = 3.14D * Math.pow((double)r, 2.0D);
        double rumus = luaslingkaran * (double)tinggi;
        return rumus;
    }

    public static void main(String[] args) {
        double volumeKubus = vKubus(10);
        double volumeBalok = vBalok(3, 6, 10);
        double volumeTabung = vTabung(7, 10);
        System.out.println("Output Volume : ");
        System.out.println("Volume Kubus : " + volumeKubus);
        System.out.println("Volume Balok : " + volumeBalok);
        System.out.println("Volume Tabung : " + volumeTabung);
    }
}
