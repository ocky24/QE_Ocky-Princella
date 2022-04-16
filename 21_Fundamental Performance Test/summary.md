# Fundamental Performance Test

## PErformance test
- teknik non functional testing untuk menentukan parameter sistem dalam hal responsif dan stabilitas di bawah berbagai beban (load) kerja
- mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan, dan penggunaan sumber daya

## Performance test jarang dilakukan
- cukup mahal untuk diaplikasikan dan dijalankan. namun bisa dijadikan tolak ukur apakah sistem tersebut bisa mengakomodasi traffic yang ada
- pengetesan memerlukan persiapan, beberapa kasus harus membuat environment terpisah dari production agar data test tidak tercampur dengan data production

## yang perlu diperhatikan dari performance test
- throughput dan response data

## Tipe performance test
- load test
pengujian paling sederhana untuk memahami perilaku sistem dalam keadaan beban teretntu. load testing menentukan kelakuan sistem pada saat kondisi normal dan puncak.
- endurance test
- stress test 
mengamati kemampuan dan kestabilan sistem pada saat kondisi ekstrem. dilakukan bertahap menuju load normal, puncak, dan melebihinya. lalu turun untuk melihat proses recovery
- peak test
