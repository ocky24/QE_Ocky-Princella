public class Luas_Segitiga {
   public static float rumusluas(float alas, float tinggi) {
    float luassegitiga = (alas*tinggi)/2;
    return luassegitiga;
   }

    public static void main(String[] args) {
    float x = 29;
    float y = 27;
    float luas = rumusluas(x,y);

        System.out.println("Hasil luas segitiga : " + luas);
    }

}
