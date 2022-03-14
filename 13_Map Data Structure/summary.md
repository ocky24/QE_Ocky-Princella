 # Map Data Structure

 1. struktur data yg ada di java yang bisa nyimpen banyak data di dalamnya
 2. diidentifikasi dengan key
 3. tiap key ada data sendiri, namanya value
 4. map disebut juga penyimpanan data berbasis key value
 5. method2nya bisa digunakna untuk menambah mengapus mengubah ataupun memeriksa isi dari map
 

 ## Implementasi MAP
 1. HashMap
 2. WeakHashMap
 3. IdentityHashMap
 4. LinkedHashMap
 5. EnumHashMap


 ## Penjelasan mplementasi MAP
 1. HashMap :
 - implementasi dari map yang menggunakan algoritma hashtable
 - kita buat dulu variabel nya, kaya gini
 - Map<String,Integer> bulan = new HashMap<>();
 - key nya adalah string, dan valuenya integer
 - lalu var bulan diisi 
 - bulan.put("Januari",1);
 - bulan.put("Februari",2);
 - bulan.put("Agustus",8);
 - system.out.println(bulan);
 - nanti muncul tuh {Agustus=8, Januari=1, Februari=2}

 2. WeakHashMap = 
 - masih menggunakan hash table, tapi pada bagian wakHashmap, key bisa dihilangkan jika tidak digunakan.
 - ketika pake system.gc(); maka beberapa key yang tidak dipake lagi datanya akan hilang dari Map

 3. IdentityHashMap = 
 - masih menrapkan hash table, tpi kalo key punya referensi pada memori yg berbeda, maka dianggap punya data yang berbeda.
 - jadi meskipun datanya sama, tapi krn alamat memori beda, dan key beda jadi dianggap data yang beda

 4. LinkedHashMap =
 - tidak ada perbedaan yang signifikan dari hashmap biasa. 

 5. ImmutableMap = 
 - Tidak dapat diubah
 - map tidak dapat ditambah isinya, ataupunmengubah data yang udah ada
 
 6. sorted map =
 - map yang dapat diurutkan baik ascending maupun descending
 - punya cara sorting sendiri2
 - ada bbrp method, seperti untuk mengurutkan key pada map tersebut
 - ada juga mendapatkan key berdasarkan urutan yang diberikan.
 - isi variable menggunakan TreeMap
 - berurutan 
 - bisa pake compare

 7. navigable map
 - masih termasuk sorted map, tapi method2 yang lebih lengkap
 - key rendah, tinggi, awal akhir ada
 - tipe data sorted ganti jadi navigable map
- kita coba cari key yang paling rendah. 
- tampil agustus karena agustus lebih rendah dari februari.

## Task praktikum sama kaya iterable, tapi untuk nomor 4 5 6nya
