# Testing Documentation

## Test Scenario
### What is a Test Scenario?
- Test Scenario adalah dokumen yang berisi kumpulan langkah-langkah oleh software tester untuk mengetes sistem.
- merupakan tingkatan tertinggi test case

**tujuan adanya test scenario**
- memudahkan dev dan tester untuk melakukan testing
- dasar pengembangan project
- dasar klien/ product owner menyesuaikan dgn sistem requirement

**membuat test scenario yang baik**
- menyusun skenario test sesuai dengan flow yang ditentukan
- user bersikap seolah-olah perlu melakukan hal tersebut
- ada rincian spesifik hal2 yg perlu diketahui oleh user
- berikan penjelasan detail mengenai ekspektasi dan test step.
- user bisa melakukan apapun sesuai requirement yang diberikan
- antara skenario atau step harus berkesinambungan.
- ada pass or fail
- kata2 konsisten
- tulis semua kemungkinan yang ada
- catat perubahan yang ada dan perbaharui versi

### Test Scenario Example
**login**
-Check Login functionality
-Check Forgot Email Functionality
-Check Create New Account Functionality


## Test Case
- uji kasus, rancangan mengenai tindakan oleh software tester untuk memverifikasi terhadap suatu fitur software
- software apakah sudah sesuai atau belum, dan mampu memberi respon ketika ada yang ga valid.
- komponen test case : test case id, test case description, pre-condition, test step,  expected result, actual result, status.
- titik awal pelaksanaan pengujian sistem.

- test case sederhana dan transparan serta mudah dipahami
- kasus uji sesuai perspektif pengguna akhir
- hindari pengulangan kasus uji
- jangan berasumsi terkait fitur atau perangkat yang diuji
- harus dapat diidentifikasi dengan test case id
- test case harus menghasilkan hasil yg sama setiap kali.

### Test case example
-Test scenario : check the login functionality
* Test case 1 : enter valid email and valid pass
* Test case 2 : enter valid email and invalid pass
* Test case 3 : enter invalid email and valid pass
* Test case 4 : enter invalid email and invalid pass

## Task 

-Tugas dari praktikum adalah membuat test case sebanyak banyaknya dari aktivitas login, pilih produk dan pembayaran dari sepulsa.com
-tugas dikerjakan dengan excel
-Terdiri atas nomor, test case id, feature, test scenario, test case,  pre conditions, test step, test data,expected result, post condition 

