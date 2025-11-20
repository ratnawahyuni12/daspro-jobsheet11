import java.util.Scanner;
public class BioskopWithScanner21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom, menu;
        String nama;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("===== OPSI MENU BIOSKOP =====");
            System.out.println();
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.println();
            System.out.print("Pilih menu: ");
            menu = sc.nextInt();
            sc.nextLine();
            System.out.println();

            switch (menu) {
                case 1:
                    // input data penonton
                    System.out.println();
                    System.out.println("===== INPUT DATA PENONTON =====");
                    System.out.print("Masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("Masukkan baris (1-4): ");
                    baris = sc.nextInt();
                    System.out.print("Masukkan kolom (1-2): ");
                    kolom = sc.nextInt();

                    // validasi nomor kursi
                    if (baris < 1 || baris > 4) {
                        System.out.println("Baris tidak tersedia, hanya tersedia di rentang 1-4 saja!");
                        System.out.println();
                        break;
                    }

                    if (kolom < 1 || kolom > 2) {
                        System.out.println("Kolom tidak tersedia, hanya tersedia di rentang 1-2 saja!");
                        System.out.println();
                        break;
                    }

                    // validasi input data penonton
                    if (penonton[baris - 1][kolom - 1] != null) {
                        System.out.println("Kursi sudah terisi oleh: " + penonton[baris - 1][kolom - 1]);
                    } else {
                        penonton[baris - 1][kolom - 1] = nama;
                        System.out.println("Data penonton berhasil ditambahkan!");
                    }

                    System.out.println();
                    break;

                case 2:
                    // tampilkan data penonton
                    System.out.println("===== DAFTAR PENONTON =====");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            String isi = (penonton[i][j] == null) ? "---" : penonton[i][j];
                            System.out.println("Baris " + (i+1) + " Kolom " + (j+1) + ": " + isi);
                        }
                    }
                    System.out.println();
                    break;
                    
                case 3:
                    // exit
                    System.out.println("===== EXIT =====");
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default: 
                System.out.println();
                System.out.println("Menu tidak valid!");
            }
        }
    }
}