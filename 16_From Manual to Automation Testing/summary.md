# From Manual to Automation

## Manual Testing
1. mencari bug pada software
2. tester memiliki peran sebagai pengguna akhir untuk pengecekan semua fitur aplikasi.
3. tester mengecek secara manual tanpa tools/script
4. untuk memastikan jika aplikasi yg diuji bebas cacat dan software bekerja sesuai yg diharapkan
5. berperan juga dalam pengujian visual dimana tidak bisa oleh automation
6. manual bisa liat kontras antara background dan button (contohnya)
7. UI feedback gak bisa ditemui oleh automation testing.

### Kelebihan Manual Testing
1. mendapatkan visual feedback. tools dan script gabisa bantu buat ngasih opini terkait tampilan UI
2. jika cuma ngetest aplikasi sederhana yg gabanyak update, maka gaperlu pake tools/software mahal
3. bisa feedback dari orang secara langsung sehingga tau yg user suka/gak (auto gak bisa nih)

### Kekurangan Manual
1. kurang teliti dari pada automation testing. kadang ada human error/gak teliti, sehingga kalo pake auto bisa ngurangin bug yg akan terlwat
2. not reusable. kalo banyak perubahan maka akan ngecek kembali dari awal untuk mastiin perubahan baru gak ngerusak aplikasi yg udah jadi
3. kalo QE udah sangat familiar dengan aplikasi yg dia test terus2, dia paham banget sama aplikasi tersebut, sehingga akan menyebabkan kelelahan pada QE dan membuat peluang terjadi kesalahan
 
## Automation Testing
1. Testing yang butuh automation tools untuk jalanin test case kita
2. QE tester perlu bikin code/script testing. nanti dijalanin oleh automation testing tools. script yg udah bener, dan dijalankan oleh automation, akan melakukan validasi scr otomatis pada software yg lagi di test
3. bergantung pada script test yg berlangsung scr otomatis. untuk ngebandingin antara expected dgn realita.

### kelebihan auto
1. menemukan bug lebih banyak dari manual tester
2. script dapat lebih dalam, sehingga bisa nemuin bug yg bahkan tester ga temui secara manual
3.  kecepatan dan efisiensi, script lebih cepat dari tester, sehingga lebih cepet selesai
4. test bisa dilakukan berulang dengan coding yg bisa di update scr berkala. 

### Kekurangan auto
1. lebih mahal karena pake tools, namun menghemat waktu serta usabilitas
2. kurang human elemen, kalo di manual kan ada interaksi user
3. tidak ada feedback terkait UI


## kenapa harus auto?
cara terbaik meningkatkan efektifitas cakupan pengujian dan kecepatan nguji software. kenapa penting?
1. manual testing yg dilakukan dari semua alur kerja akan memakan waktu dan uang
2. sulit menguji situs multi bahasa scr manual
3. automation test ga perlu campur tangan manusia, kita bisa jalanin itu tanpa pengawasan
4. ningkatin kecepatan eksekusi tes
5. bantu ningkatin scope dari tes itu sendiri
**Kalo dari PPT ini**
1. flexibility 
2. velocity
3. coverage
4. error-avoidance


## test case yang kaya gimana yg perlu automate?
1. tes case di eksekusi berulang kali, kalo manual kan nanti buang2 waktu.
2. test case yg susah dilakukan scr manual
3. test case yg butuh waktu lama ketika dilakukan scr manual

## test case yang kaya gimana yg gabisa di automate?
1. tes case yg baru dirancang dan gapernah eksekusi sama sekali
2. tes case yang requirementnya berubah2

## Automate Testing process
1. Test tool selection =
- usability
- simplicity
- cost
2. define scope of automation = 
area dimana software yg diuji akan di otomatisasi, ada poin2 nentuin scopenya, yakni fitur2 yg penting untuk bisnis, scenario yg banyak data, functionalitas umum diseluruh aplikasi, kelayakan teknis, sejauh mana komponen bisnis digunakan kembali, kompleksitas tes case, kemampuan untuk menggunakan tes case yg sama untuk pengujian lintas browser.
3. planning, design and development = 
selama fase ini, kita membuat strategi dan rencana dalam otomasi, yg nantinya berisi tools automation yg dipilih, kerangka dan fiturnya, item otomasi didalam dan diluar cakupan, persiapan, jadwal dan timeline, serta hasil dari automation testing yg berupa report.
4. test excecution = script dijalankan di fase ini, butuh input tes data sebelum dijalankan. setelah di eksekusi kita bakal dapet report.
5. maintenance. = apakah functionalitas yg baru ditambahin berjalan dgn baik/tidak. 

## BEst practice
1. scope automation perlu ditentukan scr rinci sebelum dimulai project, agar expected ditentukan dgn benar
2. tools automation tepat, jgn cuma krn populer, tapi sesuaikan sm persyaratannya
3. pilih frame work yg sesuai
4. standar membuat script, command, dan tipe kode harus seragam
5. penanganan pengecualian yg memadai (ketika ada kesalahan)
6. error message yg dibuat untuk user harus distandarisasi agar dipahami oleh tester
7. measure metrics, gabisa bandingin effort manual dgn automation. ini dibandingin dgn bug yg ditemukan, waktu minimal untuk release, indeks kepuasan user, peningkatan produktivitas
