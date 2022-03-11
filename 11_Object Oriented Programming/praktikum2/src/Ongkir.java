public class Ongkir {
    public static String harga(float berat, double dimensi) {
        String uang;
        if (dimensi > 0.0D && dimensi <= 50.0D) {
            if ((double)berat > 0.1D && berat <= 1.0F) {
                uang = "5000";
            } else if (berat > 1.0F) {
                uang = "15000";
            } else {
                uang = "Berat tidak valid";
            }
        } else if (dimensi > 50.0D) {
            if ((double)berat > 0.1D && berat <= 1.0F) {
                uang = "10000";
            } else if (berat > 1.0F) {
                uang = "25000";
            } else {
                uang = "Berat tidak valid";
            }
        } else {
            uang = "Dimensi tidak valid";
        }

        return uang;
    }

    public static void main(String[] args) {
        double dimensi = Menghitungvolume.vBalok(5, 2, 4);
        String ongkir = harga(1.0F, dimensi);
        System.out.println("Harga ongkir sebesar : " + ongkir);
    }





}
