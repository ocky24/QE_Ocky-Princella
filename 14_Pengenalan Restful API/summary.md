# Pengenalan RESTful API (Basic of API Testing)

## API & REST API

### API
1. Application Programming Interface
2. penghubung yang memungkinkan aplikasi berinterasksi dengan aplikasi lainnya untuk membagi data
3. tujuannya untuk mempercepat proses development dengan menyediakan function secara terpisah sehingga dev gaperlu bikin fitur yang sama
6. membawa pesan dari pengguna dan memberitahu sistem apa yang harus dilakukan. kemudian memebrikan respon dari permintaan tersebut
7. alurnya kaya Client => waiter => chef. (Request)
8. Chef => waiter => client (response)

### REST API
1. REST API (Representational State Transfer)
2. standar arsitektur komunikasi berbasis web
3. umumnya menggunakan http untuk protokol komunikasi data
4. berisi aturan/batasan yg bisa batasin dev untuk bisa mengakses/ melakukan tindakan tertentu pada database
5. rest -> yg bikin aturan

### HTTP Method
1. memungkinkan komunikasi client dan server
2. protokol respon dari client dan server
3. contoh, client kirim permintaan http ke server, nah si server kasih respon ke client.
4. GET = membaca data, tidak menyebabkan ada nya pembaruan data apapun.
5. PUT = membuat/mengganti data, bedanya dengan post, kalo put idemporten, mengambil request put yg sama berulang kali, akan selalu menghasilkan hasil yang sama. kalau post efeknya reource kebikin berulang kali.
6. POST = membuat data baru ke server. bisa juga untuk bikin resource baru.
7. DELETE = Menghapus data yang ada

### REST API Component
1. Method = get, post, put, delete
2. URL (Base URL + Path) = cara kita dapat melakukan request, berisi kata kunci yang menunjuk ke server apa yg ingin kita lakukan.
3. HEADER = kumpulan field dn dan value yg berisi serangkaian info ke penerima. 
4. BODY = mendefinisikan informasi yg dikirim ke server

### JSON
1. format data untk pertukaran dan penyimpanan data
2. bagian dari javascript
3. bisa di baca C, C++, java, pyhton dan banyak lagi
4. bahasa ideal untuk pertukaran data pada aplikasi


**download postman**
1. collection => kita bisa bikin API atau request kita
2. namain collection => user
3. bikin sebuah request di dalam user itu. ambil API dari reqres.in
4. klik -> copy URL
5. bikin request baru, GET-userdetails
6. paste URL nya, body kosongin.
7. klik send.
8. nanti ada responnya
9. bikin request baru, misalkan Post => Post - Create new user
10. ambil lagi di reqres.in, copy lagi URL.
11. ada body untuk data yang dkirimkan. copy datanya di reqres
12. buka body. pilih raw, paste, JSON, send
13. nanti ada responnya
14. jangan lupa di save.
15. Put -  update blablabla
16. copy url, paste, pake request body juga. raw, JSON, send. responnya bandingin sama di web.


## Testing API
1. memastikan functional API
2. diharapkan bisa ngasih gambaran gimana respon aplikasi web, tanpa ataupun GUI nya siap
3. meluaskan cakupan testing, melakukan testing sedini mungking, dimana GUI belum sepenuhnya siap untuk disertakan dalam proses testing

**Kind of API Testing**
1. functionality = untuk memvalidasi suatu fitur apakah sudah berfungsi atau belum
2. load test = menguji kekuatan suatu sistem, apakah bisa menjalankan beban yg diberikan
3. security = menguji keamanan suatu sistem

ada bbrp tools, postman, frsby, jmeter, rest assured.


**tahapan proses dalam melakukan API Testing**
1. spesification review = mereview dari speisifikasi API dan use case dokumen
2. Specification dev
3. framework dev = milih tools API testing
4. test case dev = bikin test scenario dan test case
5. execution & report

## Advantages & Challenge
**Advantage**
1. efisiensi waktu
2. bahasa yang independen
3. mengurangi biaya testing
4. mengurangi resiko

**Challenges**
1. kombinasi parameter, pemilihan parameter
2. tidak ada GUI
3. Kita harus mengetahui terlebih dahulu parameter
4. perlu juga mengetest error handling dari setiap API


### Conclusion
1. API terdiri atas kumpulan class, function, atau procedures yang merepresentasikan bisnis logic. API testing sangat diperlukan dalam software engineer.