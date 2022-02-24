#Kesimpulan:
===========

##Line coverage 
---------------
Jumlah baris yang dibuat dan udah di dieksekusi (Testing)/ perbandingan antara jumlah baris yang ditesting dengan jumlah keseluruhan baris.

Pada soal tersebut:
Entity: 6/9 berarti yang sudah ditesting 6 baris dari 9 baris.

Service: 6/6 berarti yang sudah ditesting 6 baris dari 6 baris.



##Mutation Coverage 
------------------
Modifikasi satu bagian kecil dari si functionnya, mutation testing untuk menentukan apakah test case sudah cukup atau belum.

program yang telah dimodifikasi tersebut dinamakan mutan -> mutan harus dibunuh.

mutan dibunuh (killable)-> jika menghasilkan output yang berbeda dari pada program aslinya.

mutan tidak dapat dibunuh (non-killable) -> jika output tidak berbeda.

mutation score menunjukan persentase seberapa banyak mutan yang terbunuh dibandingkan keseluruhan jumlah mutan yang diciptakan

Semakin besar maka semakin baik. => semakin banyak terbunuh semakin baik.

###mutation score: 100% berarti test case nya udah cukup

###mutation score: <100 % berarti perlu ditambah test case. sehingga mutant non killable menjadi killable dan mutation score menjadi 100%

Pada soal tersebut, keduanya belum 100%

2/3 => 2 killable, 1 non-killable. kita harus tambah mutasi lagi. Agar sampai killable semua.
3/4 => 3 killable, 1 non-killable. kita harus tambah mutasi lagi. Agar sampai killable semua.