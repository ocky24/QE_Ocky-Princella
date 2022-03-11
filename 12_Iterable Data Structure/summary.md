# ITERABLE
1. data/struktur data yang bisa dilakukan iterasi padanya
2. interface iterable = tertinggi dari struktur data lainnya
3. di bawahnya ada interface collection dll lah pokoknya. (liat bagan di video)
4. method-method pada iterable = forEach, iterator, spliterator.
5. iterable jadi type data dari names ( dicontoh), jadi kita bisa pake name itu untuk sebuah for.
6. jadi names akan dimasukan dalam variabel name untuk yang 'alterra', lalu di print. 
7. lalu selanjutnya academy, dan nanti academy akan diprint.

## Iterator
1. merupakan method dari iterable
2. mengelola, pada bagian mana kita sudah melakukan iterasi pada data iterable dan mengetahui data apa yang berikutnya akan diambil dan bagaimana cara mengambilnya.
3. misalnya, setelah names tadi, kita masukin variable it, sebagai iterator dari names. 
4. while (it.hasNext()) {
5. String i = it.next()'
6. system.out.println(i);
7. }
8. di perulangan, ambil data berikutnya. it next, bernilai true, maka akan ambil nama 'alterra', lalu ditampilkan pada layar.
9. Setelah itu perulangan berlanjut, dan akan it has next lagi, true, diambil lagi dan di print.
10. abis itu it has next lagi, false krn gada kata lagi. 
11. outputnya muncul deh.

## Collections
1. kumpulan objek/data yg diletakan pada tempat yg sama.
2. ada banyak method pada collection, seperti penambahan, penghapusan, memeriksa isi, iterator, melihat ukuran collection, dll.
3. kalo di contoh, pakenya arraylist.
4. Collection<String> names = new ArrayList<>();
5. names.add ("Alterra");
6. names.add ("Academy");
7. names.add ("Coba");
8. names.remove ("Coba");
9. system.out.println(names.contains("Alterra"));  (apakahpada nama ada data 'alterra'?) maka jawabannya TRUE.

## List
1. interface untuk menyimpan data secara linear
2. turunan dari collection
3. menerima nilai yang sama, kalau ada 2 data yg nilainya sama, bisa dilakukan
4. data diurutkan berdasarkan waktu
5. ada banyak method pada list. 

### ArrayList
1. menyediakan penyimpanan data yang dinamis tidak terikat oleh kapasitas penyimpanan (tidak terbatas)
2. konstan
3. apus/nambah data pada bagian awal, lebih lama
4. apus/nambah data pada bagian akhir dan tengah, sama aja


### linkedlist
1. struktur data yang elementnya saling terhubung dengan menyimpan alamat memori dari setiap elemen, element menyimpan alamat memori elemen sebelumnya. dan begitu seterusnya.
2. untuk ambil elemen, lebih lama waktunya
3. apus/nambah data pada bagian awal, lebi cepat
4. apus/nambah data pada bagian akhir dan tengah, sama aja


### Immutable List
1. bagian dari list tapi tidak dapat diubah datanya
2. ketika kita punya ini, nah ketika kita mau menambah data, gaboleh. krn dia gamau ubah datanya. 

### Stack
1. menyimpan data scr linier, pengambilan datanya LIFO, last in first out
2. pop mengambil data, peek mengintip data, push nambah data


## Set
1. menyimpan data secara linier tapi gabisa nerima data yg duplikat, kalo ada double, nyimpen 1 aja.

## hash set
1. struktur data menyediakan cara tercepat untuk mencari data
2. kalo ada 2 data yg sama, dia masukin 1 aja. tidak menerapkan metod epenyimpanan dari waktunya.

## Linkedhashset
1. nampilin data sesuai urutan masuknya

## enum set
1. urutan nya ikutin penulisan dari enum tersebut.
2. ada enum isi nya bulan
3. nah, dalamnya ada iterator ithas gitu2
4. tmapilin sesuai di enumnya.


