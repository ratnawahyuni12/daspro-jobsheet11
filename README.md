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
5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, lalu amati hasilnya.
System.out.println(penonton.length);

for (int i = 0; i < penonton.length; i++) {
    System.out.println("Panjang baris ke-" + (i+1) + ": " + penonton[i].length);
}
6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, lalu amati hasilnya.
System.out.println(penonton.length);

for (String[] barisPenonton : penonton) {
    System.out.println("Panjang baris: " + barisPenonton.length);
}
7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Complile, run, lalu amati hasilnya.
System.out.println("Penonton pada baris ke-3: ");

for (int i = 0; i < penonton[2].length; i++) {
    System.out.println(penonton[2][i]);
}
8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya.
System.out.println("Penonton pada baris ke-3: ");

for (String i : penonton[2]) {
    System.out.println(i);
}
9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.
for (int i = 0; i < penonton.length; i++) {
    System.out.println("Penonton pada baris ke-" + (i+1) + ": " + String.join(", ", penonton[i]));
}
10. Menurut anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?
Jawab : 
a. kekurangan : tidak bisa mengakses indeks secara langsung, tidak bisa mengubah elemen array secara langsung, tidak cocok untuk array 2D atau struktur kompleks, tidak bisa mengontrol langkah(step).
b. kelebihan : lebih sederhana dan mudah dibaca, mengurangi kemungkinan error, cocok untuk membaca semua elemen. 