public class Kalkulator {

        private static int penjumlahan(int a, int b) {
            int rumus = a + b;
            return rumus;
        }

        private static int pengurangan(int a, int b) {
            int rumus = a - b;
            return rumus;
        }

        private static int perkalian(int a, int b) {
            int rumus = a * b;
            return rumus;
        }

        private static float pembagian(int a, int b) {
            float rumus = (float)(a / b);
            return rumus;
        }

        public static void main(String[] args) {
            int jumlah = penjumlahan(3, 4);
            int kurang = pengurangan(15, 4);
            int kali = perkalian(10, 10);
            float bagi = pembagian(12, 3);
            System.out.println("Output kalkulator: ");
            System.out.println("Hasil penjumlahan : " + jumlah);
            System.out.println("Hasil pengurangan : " + kurang);
            System.out.println("Hasil perkalian : " + kali);
            System.out.println("Hasil pembagian : " + bagi);
        }
    }