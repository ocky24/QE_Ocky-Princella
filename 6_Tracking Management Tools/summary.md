# Tracking Management Tools

software untuk mengelola proyek seperti JIRA, Trelo dsb.

## JIRA
- Alat bantu untuk pelacakan bugs, pelacakan issue, dan manajemen proyek.
- fitur Task Assignment, ada antarmuka mengenai workflow yang dijalankan, jadi tim tau si project ini sejauh mana selesainya
- scrum dan kanban board, tim bisa lebih mudah brainstorming.
- roadmaps, tim tau gambaran kedepannya, dan fokus terhadap apa yang dikerjakan. selain itu team leader bisa kontrol penuh terhadap project secara utuh. 
- konektivitas thp aplikasi lain.
- ada fitur pelaporan dengan visualisasi menarik, dan memudahkan team leader dlm menentukan kebijakan

## buat project baru di JIRA dengan metode Scrum
- klik menu project -> create project -> scrum -> use scrum template
- project type -> team managed
- nama project -> misal : QE_Ocky
- Akan ada 3 panel To do, in progress, done. (panel ditambahkan sesuai kebutuhan)
- panel to do = story yang akan dikerjakan dan di prioritaskan, paling atas = prioritas utama
- in progress, sedang di kerjakan oleh software engineer
- finish = sudah selesai dikerjakan oleh dev, namun belum siap untuk testing
- deliver = story yang siap masuk tahap testing oleh QE
- testing = story yang sedang di test
- need fix = ga lolos kriteria testing
- done = udah sesuai kriteria testing

## Membuat issue
- klik create -> isi project -> issue type -> isi summary (judul misal : as user i want to login) -> isi deskripsi (apa maksud dari issue ini)

**contoh deskripsi** : 
- given : user on login page
- When : user input valid username and password
- then : user success login

**Issue type**
1. Story = jenis issue untuk membuat fitur baru
2. Task = jenis issue untuk merinci tugas-tugas yang akan dikerjakan
3. Bug = jenis issue apabila terjadi penemuan bug saat proses testing oleh QE
4. Epic = jenis issue untuk mengelompokkan task.

- asignee = dikerjakan oleh siapa
- label 
- sprint = ruang waktu pengerjaan task/issue (1 atau 2 minggu)
- priority : tingkat kesulitan sebuah task/issue tersebut. highest, hig, low, dll
- reporter : siapa yang buat issue ini.

**klik create**


## Apa yang harus diperhatikan oleh QE pada JIRA?
- Ketika ada bugs saat testing, buat issue type bugs
- jelaskan kondisi seperti apa, expected bagaimana, dan langkah2 testing.
- pindahkan story/issue yang ada bugs ke panel in progress.


## Task Praktikum
- Teori : menjawab 6 pertanyaan terkait dengan fitur2 pada JIRA
- Practice : membuat simulasi terjadinya bug pada JIRA. minimal 5 bug. kemudian kita melampirkan step2 pengerjaan.