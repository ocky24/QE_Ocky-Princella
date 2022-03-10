import java.math.MathContext;
public class Ongkir {


    public static String harga(float berat, double dimensi) {
        String uang;
        if (dimensi>0 && dimensi <=50) {
            if (berat>0.1 && berat<=1) {
                uang = "5000";
            }else if (berat >1) uang = "15000";
            else uang = "Berat tidak valid";
        }
        else if (dimensi > 50) {
            if (berat>0.1 && berat<=1) {
                uang = "10000";
            }else if (berat >1) uang = "25000";
            else uang = "Berat tidak valid";
        }
        else uang = "Dimensi tidak valid";

        return uang;
//        dimensi 0-50 cm^3 dan berat 0.1-1 kg =5000
//        dimensi > 50 cm^3 dan berat > 1 kg = 25000
//        dimensi 0-50 cm^3 dan berat > 1 kg=15000
//        dimensi >50 cm^3 dan berat 0.1-1 kg = 10.000
    }

    public static void main(String[] args) {
        double dimensi = Menghitungvolume.vBalok(5,2,4);
        String ongkir = harga(1, dimensi);

        System.out.println("Harga ongkir sebesar : " + ongkir);

    }


}
