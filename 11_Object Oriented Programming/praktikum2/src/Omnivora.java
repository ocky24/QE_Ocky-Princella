//gatau
public class Omnivora extends Animal{
    public static void main(String[] args) {
        Animal omnivor = new Animal();
        omnivor.nama = "Omnivor";
        omnivor.jenisMakanan = "daging dan tumbuhan";
        omnivor.gigi = "tumpul dan tajam";
        System.out.println("halo, aku " + omnivor.nama + ", makananku adalah " + omnivor.jenisMakanan + ", aku memiliki gigi yang " + omnivor.gigi);
    }
}
