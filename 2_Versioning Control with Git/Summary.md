Session 2 - Versioning Control with Git
=======================================

Versioning / Version Control
-----------------------------
-> Sebuah sistem yang merekam perubahan-perubahan dari waktu ke waktu sehingga kita bisa melihat lagi versi tertentu suatu saat nanti.


GIT
--------
-> Salah satu version control system populer yang digunakan oleh para developer untuk mengembangkan software bersama-sama

GIT men-track setiap perubahan pada file
Commit adalah record/catatan dari perubahan

GITHUB = Git hosting service

Menghubungkan GIT dan Github
-------------------------------
-> buat folder di documents
-> lalu masuk ke folder tersebut (cd nama folder)

git config --global user.name "username"

git config --global user.email "email yang di github"

git init

git remote add origin <remote_repo_url> ini ada di code github)

Menambahkan file
----------------
buat file dalam folder yang sudah dihubungkan
git add namafolder.jenisfile
git commit -m "Keterangannya mau apa"
git push origin master -> master disini untuk mengupload si file tadi di branch master

Menambahkan branch
-------------------
git branch namabranch atau
git branch -M namabranch  => M disini untuk langsung pindah branch
git checkout namabranch => untuk pindah branch
nah, di branch ini kita bisa masukin file yang udah diedit tadi.
git pull origin master => buat ambil github ke git (yang udah diupdate) master = nama branch
git branch -D => untuk hapus branch, tapi sebelumnya kita harus keluar dari branch ini dulu.

Task Praktikum
-----------------
Jadi, di task praktikum ini kita membuat suatu project yang nantinya ada branch develop dan branch untuk menambah fitur1 dan fitur 2
Setelah menghubungkan git dan github
pertama, saya membuat folder 2_versioning Control with Git
lalu membuat folder praktikum, screenshot, dan summary.md

pada folder praktikum, saya membuat file 'tugaspraktikum.txt'
dan file ini saya push ke github, pada branch master.

setelah itu, buat branch development, dan pada branch development kita lakukan perubahan pada file 'tugaspraktikum.txt'
kemudian disave, dan di push lagi ke branch development.

Setelah itu, kita buat branch fitur1, dan pada branch fitur1 kita lakukan kembali perubahan pada file 'tugaspraktikum.txt'
kemudian di save dan dipush ke branch fitur 1.
pada tahap ini, saya memerged antara fitur 1 dan branch development melalui github.

kemudian setelah di merged, sebelum membuat branch fitur2, kita pull dulu github yang sudah dimerged tadi pada branch development.
setelah itu buat branch fitur2
lakukan lagi perubahan pada file 'tugaspraktikum.txt'
kemudian di save dan di push ke branch fitur2.

kemudian saya memerged antara fitur 2 dan development.
lalu yang terakhir saya memerged antara development dengan master.

untuk hasil network sudah ada pada file screenshoot.


