# Penjelasan Tugas Praktikum

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