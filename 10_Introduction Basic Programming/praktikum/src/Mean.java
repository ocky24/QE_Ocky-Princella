//sudah aman
public class Mean {
    private static float rata(float[] angka) {
        int i;
        int x = angka.length-1;  //karena jumlah angkanya 4, sedangkan indeksnya 0,1,2,3, jadinya x harus 3
        float rumus = angka[0];  //biar si angka 0 masukin dulu ke 'rumus'
        for (i = 1; i <= x; i++){ // mulai dari 1 karena biar angka 0 + angka 1
            rumus = rumus + angka[i];
//            System.out.println(rumus);  //ini buat ngecek aja tadi hitungannya
        }
        float hasil = rumus/(x+1);  // kenapa x+1? karena kan tadi x = 3, sedangkan jumlah data ada 4, maka x+1
        return hasil;
    }

    public static void main(String[] args) {
        float[] value = {1,2,3,4};   //masukin angka yang mau dirata2in
        System.out.println(" Hasil rata-ratanya adalah: "+ rata(value));
    }
}
