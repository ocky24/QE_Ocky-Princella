import java.math.MathContext;
public class Menghitungvolume {
    private static Double vKubus(int a){
        double rumus = a*a*a;
        return rumus;
    }
    public static Double vBalok(int p, int l, int t){
        double rumus = p*l*t;
        return rumus;
    }
    private static Double vTabung(int r, int tinggi){
        double luaslingkaran = 3.14*Math.pow(r,2);
        double rumus = luaslingkaran*tinggi;
        return rumus;
    }

    public static void main(String[] args) {
        double volumeKubus = vKubus(10);
        double volumeBalok = vBalok(3,6,10);
        double volumeTabung = vTabung(7,10);

        System.out.println("Output Volume : ");
        System.out.println("Volume Kubus : " + volumeKubus);
        System.out.println("Volume Balok : " + volumeBalok);
        System.out.println("Volume Tabung : " + volumeTabung);
    }


}
