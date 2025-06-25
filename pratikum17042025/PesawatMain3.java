/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratikum17042025;
import java.util.Scanner;
/**
 *
 * @author frisk
 */
public class PesawatMain3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        Pesawat[] daftarPesawat = new Pesawat[100]; // maksimal 100 pesawat
        int jumlah = 0;
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU PROGRAM PESAWAT ===");
            System.out.println("1. Tambah Data Pesawat");
            System.out.println("2. Tampilkan Semua Data Pesawat");
            System.out.println("3. Tampilkan Pesawat dengan Kapasitas Terbesar");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int menu = in.nextInt();
            in.nextLine(); // bersihkan newline

            switch (menu) {
                case 1:
                    System.out.print("\nBerapa banyak pesawat yang ingin ditambahkan? ");
                    int tambah = in.nextInt();
                    in.nextLine();

                    for (int i = 0; i < tambah; i++) {
                        System.out.println("\nInput data pesawat ke-" + (jumlah + 1));
                        System.out.print("Nama pesawat: ");
                        String nama = in.nextLine();

                        System.out.print("Tahun produksi: ");
                        int tahunProduksi = in.nextInt();

                        System.out.print("Menggunakan mesin? (true/false): ");
                        boolean mesin = in.nextBoolean();

                        System.out.print("Jumlah maksimum penumpang: ");
                        int muatan = in.nextInt();
                        in.nextLine(); // bersihkan newline

                        daftarPesawat[jumlah] = new Pesawat(nama, tahunProduksi, mesin, muatan);
                        jumlah++;
                    }
                    break;

                case 2:
                    if (jumlah == 0) {
                        System.out.println("\nBelum ada data pesawat.");
                    } else {
                        System.out.println("\n=== DAFTAR PESAWAT ===");
                        for (int i = 0; i < jumlah; i++) {
                            System.out.println("Data pesawat ke-" + (i + 1));
                            daftarPesawat[i].Cetak();
                            System.out.println();
                        }
                    }
                    break;

                case 3:
                    if (jumlah == 0) {
                        System.out.println("\nBelum ada data pesawat.");
                    } else {
                        int max = daftarPesawat[0].getMuatan();
                        String namaMax = daftarPesawat[0].getNama();

                        for (int i = 1; i < jumlah; i++) {
                            if (daftarPesawat[i].getMuatan() > max) {
                                max = daftarPesawat[i].getMuatan();
                                namaMax = daftarPesawat[i].getNama();
                            }
                        }

                        System.out.println("\nPesawat dengan kapasitas penumpang terbesar:");
                        System.out.println("Nama: " + namaMax);
                        System.out.println("Kapasitas: " + max + " orang");
                    }
                    break;

                case 4:
                    System.out.println("Terima kasih. Program selesai.");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1 - 4.");
            }
        }

        in.close();
        }
}
