Software Testing Fundamental
============================

Definition of sofware Testing
-----------------------------
Proses menganalisis software item untuk mendeteksi apakah ada perbedaan antara kondisi yang ada dengan kondisi yang diharapkan (contohnya: defects) dan juga untuk mengevaluasi fitur dari software item.


How Important Software Testing
------------------------------
Cerita 1: terjadi kegagalan setelah upgrade software pada suncorp bank, akibatnya uang hilang dari rekening bank pelanggan, penarikan berlebih, dan akun terkunci.

Cerita 2: terdapat bug yg mengakibatkan terkonfigurasinya therac 25 sehingga berkas elektron akan menembang dalam modus kekuasaan tinggi. menyebabkan 3 orang meninggal dan 3 org luka parah 

Software testing penting, karena bisa menghemat uang, menjamin kualitas produk, keamanan, dan kepuasan pelanggan. bugs software bisa berbahaya.


Testing Platform
----------------
API (Application Programming interface)
-> pengembangan software, memungkinkan terjadinya pertukaran data yg aman antarsoftware

Web

Mobile -> WA, telegram, facebook. terbagi dua IOS dan android

Desktop -> code editor, video player



Types of Software Testing
-------------------------
Functional Testing
------------------
setiap fungsi aplikasi telah berjalan sesuai requirements spek
contoh: pada pintu otomatis, sudah diatur jarak nya supaya dia terbuka

manual: mencari cacat pada software, tester mengecek secara manual tanpa tools/ script, lebih lambat dari automate, bisa memberi masukan pada tampilan UI

automation : dengan software testing, membandingkan output prediksi dengan output yg dihasilkan sistem. tester membuat code dan dijalankan automation tools.


Non-Functional Testing
----------------------
Pengujian kinerja, keandalan, kegunaan, keamanan, dll

dilakukan setelah functional testing

bisa meningkatkan kualitas software menjadi lebih baik.

performance testing => memastikan software bekerja baik pada beban kerja yang diharapkan.

concern:
#speed -> kecepatan respon aplikasi
#scalability -> maks userload yg bisa dihandle aplikasi
#stability -> kestabilan pada berbagai load.



Maintenance
------------
Setelah aplikasi di release ke konsumen.
pengujian regresi jenis pengujian perangkat lunak untuk mengkonfirmasi bahwa fitur baru atau perubahan kode tidak mempengaruhi fitur yang ada.


Level of Testing
----------------
Unit testing
Integration Testing
System Testing
Acceptance Testing


##TASK PRAKTIKUM
==============
Tugas pertama adalah menyimpulkan hasil testing berdasarkan line coverage dan mutation.

mutasi:
2/3 => 2 killable, 1 non-killable. kita harus tambah mutasi lagi. Agar sampai killable semua.
3/4 => 3 killable, 1 non-killable. kita harus tambah mutasi lagi. Agar sampai killable semua.

line coverage:
Entity: 6/9 berarti yang sudah ditesting 6 baris dari 9 baris.
Service: 6/6 berarti yang sudah ditesting 6 baris dari 6 baris.

Tugas kedua adalah menyimpulkan hasil dari function.
1. Terdapat kelas bernama CalculatorServiceImpl
2. Di dalamnya terdapat fungsi Add (menambahkan) dan Substract (Mengurangkan)
3. Terdapat 3 variabel yakni a, b, dan c dengan jenis data integer.
4. a dan b merupakan bilangan yang kita masukan
5. c untuk mengeluarkan hasil penjumlahan dan pengurangan