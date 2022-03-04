# Agile Testing
SDLC = Software Development Life Cycle


## Definisi SDLC
- proses untuk merancang, mengembangkan, dan menguji software 
- untuk menyediakan alur terstruktur untuk menghasilkan software kualitas tinggi dengan biaya rendah dan memenuhi kebutuhan.
- metodologi yang berulang.
- memberikan gambaran input output jelas dari tahapan ke tahapan selanjutnya.

## Phases of SDLC
- Requirements Gathering : 
  * sistem akan dianalisis bagaimana nanti dijalankan, kelebihan kekurangan sistem, fungsi sistem , pembaharuan yang dapat diterapkan
  * merupakan bagian perencanaan, selain itu, ada alokasi sumber daya, kapasitas, jadwal proyek, biaya, dan penetapan.
  * manager dan developer dapat bekerja maksimal dalam tahap ini


- Design :
  * membuat model cara kerja aplikasi/software
  * communication, programming, architecture, user interface, platform, security (langkah2 perlindungan), membuat prototype


- Development (code) :
  * proyek kecil = dapat ditulis 1 dev aja, kalo besar bisa beberapa tim
  * menemukan memperbaiki error juga
  * nulis FAQ


- Testing :
  * sistem diuji sebelum di publish, apakah bisa bekerja optimal atau tidak.
  * kualitas kode, integration testing, performance testing, security testing


- Deployment : 
  * aplikasi sudah tersedia pada user untuk digunakan
  * lebih rumit
  * bukan berarti tahapan SDLC selesai, ttp perlu mendapatkan feedback pengguna


- Maintenance
  * aplikasi sudah selesai dan bisa digunakan oleh pengguna.
  * bisa jadi ada bug pada aplikasi
  * akan muncul sistem SDLC yang baru


 ## model SDLC
1. Waterfall =
   * salah satu model tertua dan tersingkat dalam penerapannya 
   * setelah fase 1 selesai, fase berikutnya dimulai. 
   * jika ada satu detail kecil tertinggal maka akan mempengaruhi keseluruhan.

2. agile model = 
   * Memisahkan produk dengan proses dan waktu pengerjaannya secara cepat
   * tim akan mencoba tiap produk yang sudah selesai untuk meminimalisir kesalahan.
   * Dapat memicu proyek ke arah yg salah dan ga sesuai keinginan

3. iterative model = 
   * repetisi tinggi,
   * dapat mengkonsumsi bahan baku jika ada 1 detail tertinggal

4. V-shaped model
   * lanjutan waterfall model
   * mencoba tiap fase dalam proses pengembangan suatu produk

5. Bigbang model
   * model yang beresiko tinggi saat dijalankan, karena semua bahan baku diinvestasikan dalam project tersebut.
   * berhasil untuk proyek yang kecil dan berbahaya untuk proyek yang besar

6. Sprial model
   * paling fleksibel dan mirip iterative model
   * fokus pada repetisi dalam pengerjaannya.


## Agile Testing Manifesto
hal-hal yang jauh dari agile testing manifesto : 
- Testing is always behind
- automation is even further behind that
- testers can't work until development is done
- there is pressure at the end of a sprint
- there is blame around bugs (it's his fault etc.)

5 kunci dalam agile testing manifesto:
1. Testing is an activity not a phase = biasanya testing di akhir proses dev, tp akan memakan waktu lama krn kita melakukan full testing untuk aplikasi yang belum pernah di coba sebelumnya. maka tester perlu beriringan dengan development. seperti membuat test case sebelum dev menulis code.

2. prevent bugs rather than finding bugs = bug bisa muncul karena req yang kurang lengkap/detail. sehingga kita perlu tulis dulu req nya, dengan komunikasi sesama anggota tim.

3. dont be a checker, be a tester = jangan ngecek doang dan ga paham kebutuhan user. maka kita perlu memberikan feedback terhadap apa yg dites

4. dont try to break the system, instead help build the best possible system = qe bakal nyari positif dan negatif. dan terkadang senang kalo nemu bugnya. tapi kita perlu inget bahwa kita mau bikin software yang berkualitas. sehingga kita perlu memposisikan diri sebagai user. 

5. the whole team is responsible for quality, not just the tester = jgn bebanin ke qe yang ga teliti cek bug, atau salahin dev karena salah coding, tp semua bertanggung jawab.

## Testing Pyramid
3 level

UI -> service -> unit test
Ui -> integration -> unit test

unit test = menguji tiap komponen perangkat lunak, pada saat di buat oleh developer, berupa modul, function, objek dll

integration = pengujian dr hasil gabungan unit2, dilakukan secara bertahap

UI = testing tingkat tinggi

semakin tinggi level = semakin sedikit test yg kita lakukan karena semakin mahal
semakin rendah maka semakin cepat pelaksanaannya


## Task Praktikum

Task praktikum berupa 2 pertanyaan terkait agile testing.
1. peran QE dalam fase SDLC
2. tantangan dalam agile testing manifesto.

sudah di jawab di folder praktikum.