# Usage in e-commerce

- Know current normal load/capacity
1. new features added => memeriksa kemampuan pada kapasitas normal untuk fitur baru seperti fitur shopeefood saat baru di release
2. just checking => memeriksa saja fitur fitur yang sudah ada.

- know the capacity on a special event
1. usual special event (cth lebaran) => ketika lebaran, orang beramai2 membeli baju di shopee, maka seharusnya sistem mampu menampung banyak request.
2. quick special event => seperti 12.12

------------

1. Apa endpoint yang biasanya akan dites?
/login, /flashsale, /pilihproduk, /checkout.
2. Apa alur transaksinya?
- /login, butuh data username dan password -> homepage
- /flashsale, dari homepage -> buka flashsale -> pilih produk
- /pilihproduk, klik salah satu produk -> tekan beli sekarang -> tentukan jumlah barang -> tekan beli sekarang
- /checkout, tekan tombol buat pesanan -> konfirmasi pembayaran
3. Apa kendala yang sering muncul saat performance test?
kendala yang muncul saat performance test seperti salah memilih performance testing tools, permasalahan di waktu dan budget yang kurang diplanning, dan kendala dalam menganalisa hasil testing yang kurang mendalam.


# Usage in payment gateway 
- Know current normal load/capacity
1. new features added => fitur yang baru 
2. just checking => cek fitur yang udah ada

- know the capacity on a special event
1. usual special event => pas lebaran, banyak yang menggunakan ovo untuk bagi2 THR 
2. quick special event => idk:)

----------

1. Apa endpoint yang biasanya akan dites?
/login
/charge_create
/datapengguna
2. Apa alur transaksinya?
- pengguna membeli produk dan disampaikan pada koneksi sumber payment gateway
- payment gateway meneruskan informasi ke prosesor pembayaran bank pengguna
- prosesor pembayaran meneruskan informasi transaksi ke asosiasi penerbit kartu yang digunakan misalnya visa
- bank terkait akan menerima permintaan dan mengirimkan balasan ke prosesor dengan kode khusus serta memberi konfirmasi apakah transaksi berhasil atau gagal
- prosesor pembayaran akan mengirimkan pesan ke payment gateway kemudian diteruskan ke web pengguna dan transaksi dinyatakan berhasil.
3. Apa kendala yang sering muncul saat performance test?
kendala yang muncul saat performance test seperti salah memilih performance testing tools, permasalahan di waktu dan budget yang kurang diplanning, dan kendala dalam menganalisa hasil testing yang kurang mendalam.

