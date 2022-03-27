# RESTful API Testing

## Konsep API
User kasih request ke waiter lalu ke chef (server/system) nanti kasih respon ke waiter, lalu dari waiter ke pelanggan/user.

## Fundamental API
**Test Process**
1. Record define API information = definisikan API yg kita test
2. Parsing, filter, or recording API Data And then extract
3. Reconstruction API Calls, and sent them from a simulate client
4. Test validation


## Test Piramid
jumlah test akan berkurang kalau naik kategori. semakin ke atas, semakin berkurang berarti testnya. krn biaya makin mahal.
1. UI = yang paling dekat dgn interaksi pengguna, status UI harus berubah sesuai yang diharapkan.
2. Integration = pengujian dr hasil penggabungan unit2 di software. dilakukan scr bertahap.
3. Component = pengujian dilakukan perkomponen individu scr terpisah
4. Unit = nguji tiap komponen, pada masa pengembangan/penulisan kode program. dilakukan oleh dev. di testnya method, function, prosedur, object dll. supaya bisa berjalan. (harus sebanyak mungkin testnya)

- untuk pom.xml nya pake serenity jbehave
- copy properties, ke intellij
- apus tags, dan webdriver
- masukin depedencies
- masukan build


