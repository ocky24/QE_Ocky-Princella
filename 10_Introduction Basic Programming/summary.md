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
     -  }
-   }


**Operator**
- untuk operasi tertentu
1. Assignment (=)           : memberikan nilai dalam satu variabel, contoh string word = "alteraa".
Variable word berisikan alteraa
2. Arithmetic (+,-,*,/,%)   : ekspresi matematika, tambah kurang kali bagi persen.
    - int a = 10;
    - int b = 15;
    - system.out.prinln(a+b);
    - *atau*
    - int sum = (a+b);
    - system.out.println("hasil dari penjumlahan : " + sum);
3. Unary                    : 
    - (+)   : membuat nilai jadi positif
    - (-)   : membuat nilai jadi negatif
    - (++)  : increment menambahkan nilai 1
    - (--)  : decrement mengurangi nilai 1
    - (!)   : kebalikan nilai boolean, true jadi false
4. Equality dan Relational  : membandingkan 2 buah nilai, hasilnya adalah boolean true/false
    - (==)  : sama
    - (!=)  : tidak sama dengan
    - (>)   : lebih besar
    - (>=)  : lebih besar sama dengan
    - (<)   : kurang dari
    - (<=)  : kurang dari sama dengan 
    - contoh : int a b yang tadi itu
    - float result = b/a
    - boolean result = a > b
    - maka hasilnya false, krn a < b
5. Conditional              : 
    - &&    : dan, jika kedua kondisi true maka true
    - ||    : atau, salah satu true, maka true

**Input Output**
- scanner = input dari keyboard, jadi kaya bikin variabel, terus nanti datanya dimasukin dengan cara kita ketikin gitu.
- Keyboard, File, Network, Program = > Java Program => "Character Stream" (reader & writer)
- "Byte" Streams (input streams & Output streams) => Java program => console, file, network, program.

**Branching**
- if then = 2 kondisi aja
- if (belanja > 10000) {
-   system.out.println("Selamat blablabla");
-   }
- system.out.println("kondisi kedua");
-

- if then else = else if buat nambahin kondisi lagi dan terakhir pake else.

- switch = ada switch (lampu) {
- case "merah" :
-   system.out.println("ini lampu merah");
- break; (buat ngehentiin ngebaca case lainnya)
- case "kuning" :
-   system.out.println("ini lampu kuning");
- break; 
- default: (ini buat kalo gada yang cocok sama semua case)
- system.out.println("lampu salah");

- }

**Looping**
- countloop = loopnya jumlah perulangan pasti (for)
- uncountloop = loppnya ga terhitung/ga pasti (while dan do-while)
- *for*
- for (int i =1; i<=5;1++) {
-   system.out.println("INI YANG DICETAK NTAR")
- }

- while = akan menjalankan ketika bernilai true. cek dulu, baru jalanin
- do-while = 1 kali perulangan dulu, baru cek kondisinya di bawah.


## Task
Membuat coding java dari soal2 yang diberikan
