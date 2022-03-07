# LINUX BASIC COMMAND

## Introduction Linux Commands
- command dijalankan diterminal linux
- terminal merupakan antarmuka baris perintah untuk berinteraksi dengan sistem yang mirip dengan command prompt di OS Windows
- command di linux sensitif terhadap huruf besar dan huruf kecil 
- sepenuhnya text based dan lebih cepat dibandingkan GUI

## Kelebihan dari command line
1. Less Resources
    - ringan digunakan sehingga tidak mengharuskan komputer memiliki spesifikasi tinggi
2. Repetitive Task Friendly
    - kita dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali
3. Powerful
    - lebih stabil krn pake teks, dibandingkan GUI, tidak makan resource memori lebih banyak.

## Kind of Commands Linux

**Struktur Command Linux**
Command (options) (parameters)
ls = menampilkan semua file di directory

ls -a/usr
ls -a -l 
ls -al 

**Basic Command**
- cal = menampilkan kalender
- date = menampilkan tanggal pada zona waktu yang tertera pada OS kita

**File system Command**
- touch = membuat file baru yang kosong
- cat   = membuat daftar konten/isi file (cat file.txt)
- cp    = menyalin file dari dir saat ini ke dir berbeda
- mv    = memindahkan file, bisa juga untuk ganti nama file
- rm    = command untuk ngapus dir beserta isinya, kita harus hati2 dimana kita berada, karena bisa terhapus.
- mkdir = directory baru
- rmdir = menghapus directory, hanya boleh digunakan untuk menghapus dir yg kosong
- cd    =  menjelajahi file, butuh nama dir
- pwd   = mencari path dari dir yang kita gunakan saat ini. 

**processes control command**
- top       = menampilkan daftar proses yang sedang berlangsung dan berapa banyak ruang cpu yang digunakan oleh tiap proses tersebut.
- clear     = membersihkan terminal
- history   = untuk mengecek command yang pernah ditambahkan sebelumnya

**Utilities Programs Commands**
- ls    = menampilkan semua file di directory kerja kita
- which = mencari file yang dapat dieksekusi terkait dengan command yang diberikan
- sudo  = super user do, menjalankan task yang membutuhkan hak akses, ga disarankan untuk test harian krn bisa terjadi error kapan saja.
- find  = mencari file dan directory, untuk mencari file didalam dir yang diberikan.

**File access permissions**
- chmod = membaca/menulis dan menjalankan permission dari file dan directory
- chown = awalnya semua file dimiliki oleh user khusus sebagai command dasar pada linux, chown mentransfer file ke user lain. 

* d rwx rwx rwx
* d= indicates directory
* (-) = indicates regular file

* rwx pertama = read, write, execute permissions for the file owner
* rwx kedua = read, write, execute permissions for the group owner of the file
* rwx ketiga = permission untuk user lain


# Shell Script

## Introduction Shell Script
- bahasa pemrograman yang disusun berdasarkan command2 shell
- program sebagai jembatan antara user dan kernel


## Why we learn shell script
- keuntungan : ketika harus mengeksekusi beberapa command secara berurut2, kita harus nunggu command pertama baru berikutnya, kalo shell script, gaperlu nunggu lagi dan tinggal nulisin aja apa yang mau dilakukan sesuai urutan lalu tinggal eksekusi aja.

## demo
- test echo '#!/bin/sh' (header untuk shell script) >> my-script.sh
- test echo "echo hello world" >> my-script/sh
- test cat my-script.sh (muncul tuh #!/bin/sh sama echo hello world)
- test ls (muncul my-script.sh)
- test ./my-script.sh  ()=> permission denied ternyata)....
- test ls -al (ternyata tidak ada huruf x di file my script kita)
- test chmod 755 my-script.sh (ini biar ada akses gitu keknya)
- test ls -al (udah tuh jadi ada x nya)
- test ./my-script.sh (muncul hello world.)

## Task Praktikum
1. terdapat beberapa command yang ada di PPT, kita disuruh untuk mencoba semuanya dan memberi keterangan. Namun, karena Os yang dipake windows, maka kita perlu mencari dulu bentuk command tersebut di windows. 
2. Membuat shell script minimal 5 command dan diberi penjelasan (ada di shellscript)
3. screenshoot berupa google drive: [https://drive.google.com/file/d/1BPnolH2hR_bkt36I0pCExY0a3xwd1Xx4/view?usp=sharing]