# Test Case Management Tools

## What the test case management tools?
situs/software yang digunakan untuk nyimpen informasi terkait pengujian serta laporan terkait jaminan kualitas produk.

## Why we need test case management tools?
- plan and estimate, fitur apa saja yang akan di test, hal2 apa saja yang berhubungan, berapa banyak sumber daya, dll
- monitoring : proses collecting, recording, reporting, dan bisa controling dalam satu tempat.
- reporting dan integrate with another tools. bisa di integrasikan ke JIRA juga

# kind of Test case management tools
- Testrail
- Test link
- Z phyr
- Qtest
- Practitest
- TcLab

# cara menggunakan testrail.
 - login dulu
 - bikin project, 
      - klik add project
      - ketik nama project
      - pilih single repository for all access.
      - klik add project.
 - bikin milestone = melacak project dan template project, bisa release software untuk internal dll , 
     - add milestone
     - isi name (fitur login di android misalnya)
     - reference dan parent skip krn pertama kali
     - description (milestone for login feature)
     - start date (tanggal mulai), end date (tanggal berakhir milestone) 
 - setelah milestone -> test run, untuk mengeksekusi test case yang sudah kita pilih dari milestone yg udh dibikin sblmnya.
     - add test run
     - name (test run 1/5/2022) 
     - milestone  (fitur login di android)
     - assign to (ke siapa ditugasinnya)
     - deskripsi (to check fucntionality login)
     - include all test cases, krn masukin semua test case dalam test run (kalo select spesific test case, kita milih test case mana yg mau di test run)
 - klik add test run.
 - akan muncul overview/report yang ada bulet2.

 ### selanjutnya add test plan

 test plan -> blue print pengujian, dokumen yang dinamis.

 hampir mirip dengan test run cara bikinnya.

- name -> fitur login di android
- milestone -> pilih yg udah kita buat
- deskripsi -> tujuan test plan, to test login feature

 **klik add test plan**

 ### selanjutnya bikin test case

 - pada menu atas, klik test case
 - add test case
 - title -> user login with valid username and valid password
 - template -> test case (test)
 - type -> functional
 - priority
 - precondition -> kondisi sebelum step2 dilakukan, contoh user on login page
 - step : user input valid username, user input valid password, user click login button.
 - expected result -> user success login.
 - klik add test case.


 jalanin test run
 - masuk ke milestone, kita start
 - test manual, terus update status test casenya
 - statusnya passed
 - assign to - siapa
 - comment
 - bisa kasih bukti si test case berhasil.
 - add result
 - nanti di overview ada 1 passed.


 ## Task praktikum
 - Mengamati website todoist dan menentukan 4 fitur yang akan dibuat test casenya
- test case terdiri atas positif dan negatif case
- saya mengerjakan 1 milestone = 1 fitur
- 1 milestone = 1 test run
- 1 test run = minimal 2 test case (positif dan negatif)

## Fitur yang diamati
- fitur login
- fitur daftar
- fitur search pada integration
- fitur quiz


## test case yang dibuat
- fitur login
   * positif : email valid dan password valid
   * negatif : 
     - email tidak valid dan password valid
     - email valid dan password tidak valid
     - email tidak valid dan password tidak valid

- fitur daftar
   * positif : daftar dengan email valid, nama huruf, dan password > 8 karakter unik
   * negatif :
     - daftar dengan email tidak valid, nama huruf, dan password > 8 karakter unik
     - daftar dengan email valid, nama angka, dan password > 8 karakter unik
     - daftar dengan email valid, nama huruf, dan password < 8 karakter unik
     - daftar dengan email valid, nama huruf, dan password > 8 karakter (123456789)

- fitur search pada integration
     * positif : search dengan keyword yang benar 'google'
     * negatif : search dengan keyword yang salah 'googld'

- fitur quiz
     * positif : mengisi kuis dengan benar
     * negatif : tidak mengisi kuis


## hasil test
- fitur login (all passed)
   * positif : email valid dan password valid 
   * negatif : 
     - email tidak valid dan password valid
     - email valid dan password tidak valid
     - email tidak valid dan password tidak valid

- fitur daftar
   * positif : daftar dengan email valid, nama huruf, dan password > 8 karakter unik (passed)
   * negatif :
     - daftar dengan email tidak valid, nama huruf, dan password > 8 karakter unik (failed)
     - daftar dengan email valid, nama angka, dan password > 8 karakter unik (failed)
     - daftar dengan email valid, nama huruf, dan password < 8 karakter unik (passed)
     - daftar dengan email valid, nama huruf, dan password > 8 karakter (123456789)    (failed)

- fitur search pada integration
     * positif : search dengan keyword yang benar 'google'  (passed)
     * negatif : search dengan keyword yang salah 'googld'   (passed)

- fitur quiz
     * positif : mengisi kuis dengan benar  (passed)
     * negatif : tidak mengisi kuis  (failed)

 