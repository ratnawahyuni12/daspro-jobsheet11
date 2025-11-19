# daspro-jobsheet11

Pertanyaan Percobaan 1 
1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!
Jawab : Tidak, pengisian elemen array tidak harus dilakukan secara berurutan mulai dari indeks ke-0. elemen array bisa diisi mulai dari mana saja selama indeks tersebut valid (berada dalam rentang ukuran array). 
2. Mengapa terdapat null pada daftar nama penonton?
Jawab : null muncul pada daftar nama penonton karena ada elemen array dengan tipe data String yang tidak diisi nilai apa pun.
3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut
penonton [0][0] = "Amin";
penonton [0][1] = "Bena";
penonton [1][0] = "Candra";
penonton [1][1] = "Dela";
penonton [2][0] = "Eka";
penonton [2][1] = "Farhan";
penonton [3][0] = "Gisel";
penonton [3][1] = "Hana";
4. Tambahkan kode program sebagai berikut:
System.out.println(penonton.length);
System.out.println(penonton[0].length);
System.out.println(penonton[1].length);
System.out.println(penonton[2].length);
System.out.println(penonton[3].length);
Jelaskan fungsi dari penonton.length dan penonton[0].length!
Apakah penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa?
Jawab : penonton.length digunakan untuk mengetahui jumlah baris pada array 2 dimensi. namun, penonton[0].length digunakan untuk mengetahui jumlah kolom pada baris ke-0. selanjutnya, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length memiliki nilai yang sama, yaitu 2.