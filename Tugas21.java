import java.util.Scanner;
public class Tugas21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] survei = new int [10][6];

        System.out.println("===== SURVEI KEPUASAN PELANGGAN =====");
        System.out.println();

        for (int i = 0; i < 10; i++) {
            System.out.println("Responden ke-" + (i + 1));
            for (int j = 0; j < 6; j++) {
                int nilai;

                while(true) {
                    System.out.print("Nilai pertanyaan ke-" + (j + 1) + " (1-5): ");
                    nilai = sc.nextInt();
                    if (nilai >= 1 && nilai <= 5) {
                        survei[i][j] = nilai;
                        break;
                    } else {
                        System.out.println("Nilai tidak valid! Masukkan kembali nilai dalam rentang 1-5!");
                    }
                }
            }
            System.out.println();
        }

        System.out.println("===== RATA - RATA RESPONDEN =====");
        System.out.println();

        double totalSemua = 0;
        for (int i = 0; i < 10; i++) {
            int total = 0;
            for (int j = 0; j < 6; j++) {
                total += survei[i][j];
            }
            double rataRataResponden = (double) total / 6;
            totalSemua += total;
            System.out.println("Rata-rata responden ke-" + (i + 1) + " adalah " + rataRataResponden);
        }
        System.out.println();

        System.out.println("===== RATA - RATA PERTANYAAN =====");
        System.out.println();

        for (int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survei[i][j];
            }
            double rataRataPertanyaan = (double) total / 10;
            System.out.println("Rata-rata pertanyaan ke-" + (j + 1) + " adalah " + rataRataPertanyaan);
        }
        System.out.println();

        System.out.println("===== RATA - RATA KESELURUHAN =====");

        double rataRataKeseluruhan = totalSemua / (10 * 6);
        System.out.println("Rata-rata keseluruhan = " + rataRataKeseluruhan);
        System.out.println();
        sc.close();
    }
}
