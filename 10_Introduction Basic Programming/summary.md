# Introduction Basic Programming

**JAVA**
- bahasa berorientasi objek
- tersusun beberapa class
- dalam class terdiri dari beberapa metode
- Bisa digunakan untuk membuat berbagai bentuk aplikasi baik dekstop, ataupun mobile

**Kelebihan Java:**
1. sederhana, jika dibandingkan bahasa pemrograman lain. karena menggunakan syntax mirip dengan c++
2. hanya fokus pada objek
3. pengamanan yang cukup ketat, ada 3 lapis, pelindung dari penyalahgunaan orang2 yang tidak bertanggung jawab.
4. bisa beroprasi di OS manapun, karena termasuk platform independen.
5. menggunakna sistem exception Handling, bisa memisahkan antara bagian pengamanan kesalahan dan bagian kode normal. jika menemukan kesalahan dia bakal buat exception. 
6. mendukung native method, fungsi yang ditulis di bahasa lain cthnya C++
7. gerbage kolektor, mengumpulkan sampah otomatis
8. daftar perpustakaan yang lengkap
9. fitur GUI (graphical user interface)
10. Penyempurnaan dari C++
11. Bisa digunakan di berbagai platform. Java merupakan b.pemrograman yang portable

**TOOlS**
1. JDK = 
- Java Development Kit
- komponen inti java
- developing, debuging, dan monitoring


2. IDE = 
- Tools yang membantu dev untuk membuat aplikasi
- ada code editor
- intelij

*Instal Intellij dan JDK*

**Pake intellij**
1. bikin project
2. pilih penyimpanan
3. pada src, klik kanan -> new -> java class
4. masukin nama

**Tipe Data**
1. Pengklasifikasian
2. Compiler bisa tau data itu digunakan untuk apa
3. integer = tipe data numeric bulat positif negatif. tipe ini dianggap paling efisien dibanding yang lainnya, contoh 
    - int number =1;
4. float = menandai nilai yang presisi, penyimpanan 32 bit. lebih cepat digunakan pad prosesor tertentu dan memakan memori kecil, tapi akan bermasalah jika terlalu kecil atau besar karena ga akurat. max 7
    - float angka = (float) 0.0000007;
5. double = ketelitian ganda, ruang penyimpanan 64 bit. perhitungan matematis lebih cepat dari float, kalo perhitungan matematis lebih baik pake ini
    - double total = 0.000000000000015;
6. string = kumpulan karakter dengan panjang tertentu, tipe data dasar, paling sering digunakan oleh para programmer. 
    - string word = "altera academy";
7. char = menyimpan 1 huruf, angka, tanda baca, atau 1 spasi kosong. biasa digunakan untuk menampilkan 1 karakter aja.
    - char huruf = 'a';
8. boolean = tipe data yang punya 2 nilai, TRUE atau FALSE.
    - boolean status = true; (atau false)
9. array = menyimpan banyak data dalam 1 variabel. pake indeks untuk mengakses datanya, indeks selalu dimulai dari 0, dan ga selalu angka, bisa jadi teks juga
    - public class Array {
        - public static void main (String [] args) {
            - char[] alterra = new char[] {
                - 'a', 'L', 't', 'e','r','r','a'  **(indeks 0,1,2,3,4,5,6)**
            }
            system.out.println(alterra[0]); **(manggil isi array indeks ke 0 yaitu 'a') kalo indeksnya lebih dia error**
        }
    }


**Operator**
- untuk operasi tertentu
1. Assignment (=)           :
2. Arithmetic (+,-,*,/,%)   :
3. Unary (+,-,++,--,!)      :
4. Equality dan Relational 