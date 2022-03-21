# Behaviour Driven Development

## Apa itu BDD?
- TDD => penulisan tes case sebelum dev menuliskan codenya. fokus pada komponen2 sistem, test case ditulis pada bahasa pemrograman
- BDD => serupa dengan TDD, ini juga menerapkan test first, tapi fokus berbeda. nanti akan ada berbagai scenario yang jelasin behaviour sistem dari perspektif pengguna, menggunakan bahasa yg mudah dipahami oleh seluruh stake holder

- tujuannya untuk ningkatin komunikasi dan kolaborasi antara seluruh stakeholder, tim bisnis maupun teknikal yang terlibat dlm pengembangan sistem. membantu mastiin bahwa fitur2 bisa dipahami oleh seluruh anggota tim.

- prinsip dasarnya mendeskripsikan behaviour dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci. 

- pada BDD, seluruh stakeholder, baik teknikal maupun non teknikal saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan functional sistem. yg dituliskan melalui feature files.

## BDD Format
- feature files ditulis pake bahasa gherkin. maka non teknikal juga bisa memahami logicnya.
- begitu pula sebaliknya, teknikal juga dapat memahami proses bisnisnya.
- ada 3 tahapan tes BDD
1. menentukan user story untuk menjelaskan kebutuhan pengguna dan functional system yg diharapkan. (As a (role) i want to (need), so that ()...))
2. menuliskan scenario dalam feature files pake gherkin. sebuah feature file ada 1 atau lebih scenario yg ngejelasin apa aja yang harus dilakukan oleh sistem dalam durasi tertentu. 
- ada 3 element utama, given, when (tindakan oleh user), then (outcome yg dihasilkan)
3. mengimplementasikan tes script berdasarkan scenario.

- contoh
- feature : login
- scenario : login as an existing user
- given :  i go to my application login page
- when : i fill correct username and passsword
- and click login
- then : i see my homepage



## Apa itu cucumber?
- untuk melakukan serangkaian behaviour test, ada tools cucumber
- cucumber adalah tools yg mendukung BDD
- cucumber membaca semacam ketentuan yg bisa dieksekusi, dimana ditulis dengan txt biasa dan ketentuan tersebut memvalidasi bahwa sistem/aplikasi melakukan apayg dituliskan sesuai ketentuan tersebut.
- ketentuan tersebut terdiri dari beberapa scenario.
- selanjutnya kita akan coba bikin scenario dari serenity BDD



## Demo BDD dengan cucumber

**praktik**
1. intellij -> maveen
2. pilih java
3. pilih lokasi dan nama
4. masukin groupid misalnya test.alta (apa ini ga keliatan)
5. lalu create project
6. tampilan awalnya akan ada pom.xml
7. masukin properties dan dependencies. semacam library, kita bisa ambil dari github serenity. 
8. (kita pake serenity BDD dan cucumber.)
9. kita copy juga plugin
10. yg merah-merah apus (krn tadi di properties di hapus)
11. selanjutnya kita klik logo m refresh. tunggu sampe proses selesai.
12. kita buat rangka folder dulu.

13. test->java->stater.stepdefinitions->CucumberTestSuite.java
14. test-> java -> directory resources -> features -. ada login.features. nah masukin step2nya disini
15. nanti di test->java->staterstepdefinitions ini, bikin class login steps buat jalanin step itu.
16. nanti bikin class lagi tuh, nah isinya function2 yang dipanggil di login steps.