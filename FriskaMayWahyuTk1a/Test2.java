/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;

import java.util.Scanner;

/**
 *
 * @author frisk
 */
public class Test2 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank bank = new Bank();

        int menu;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tambah Nasabah dengan Tabungan");
            System.out.println("3. Jumlah Nasabah");
            System.out.println("4. Cari Nasabah");
            System.out.println("5. Daftar Nasabah");
            System.out.println("6. Simpan Uang");
            System.out.println("7. Ambil Uang");
            System.out.println("8. Keluar");
            System.out.print("Pilih (1-8): ");
            menu = input.nextInt();
            input.nextLine(); // Membersihkan newline

            switch (menu) {
                case 1:
                    tambahNasabah(input, bank);
                    break;

                case 2:
                    tambahNasabahDenganTabungan(input, bank);
                    break;

                case 3:
                    System.out.println("Jumlah nasabah: " + bank.getJumlahNasabah());
                    break;

                case 4:
                    cariNasabah(input, bank);
                    break;

                case 5:
                    tampilkanSemuaNasabah(bank);
                    break;

                case 6:
                    simpanUang(input, bank);
                    break;

                case 7:
                    ambilUang(input, bank);
                    break;

                case 8:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan salah. Coba lagi.");
            }
        } while (menu != 8);

        input.close();
    }

    private static void tambahNasabah(Scanner input, Bank bank) {
        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();
        bank.tambahNasabah(namaAwal, namaAkhir);
        System.out.println("Nasabah ditambahkan.");
    }

    private static void tambahNasabahDenganTabungan(Scanner input, Bank bank) {
        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();
        System.out.print("Saldo Awal: ");
        int saldo = input.nextInt();
        bank.tambahNasabah(namaAwal, namaAkhir, new Tabungan(saldo));
        System.out.println("Nasabah dengan tabungan ditambahkan.");
    }

    private static void cariNasabah(Scanner input, Bank bank) {
        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();
        int indeks = bank.searchNasabah(namaAwal, namaAkhir);
        if (indeks != -1) {
            System.out.println("Nasabah ditemukan: " + bank.getNasabah(indeks));
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }

    private static void tampilkanSemuaNasabah(Bank bank) {
        System.out.println("Daftar Nasabah:");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            System.out.println(i + "." + bank.getNasabah(i).toString());
        }
    }

    private static void simpanUang(Scanner input, Bank bank) {
        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();
        int indeks = bank.searchNasabah(namaAwal, namaAkhir);
        if (indeks != -1) {
            Nasabah nasabah = bank.getNasabah(indeks);
            if (nasabah.getTabungan() == null) {
                System.out.println("Nasabah tidak memiliki tabungan.");
            } else {
                System.out.print("Jumlah disimpan: ");
                int jumlah = input.nextInt();
                nasabah.getTabungan().simpanUang(jumlah);
                System.out.println("Uang disimpan.");
            }
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }

    private static void ambilUang(Scanner input, Bank bank) {
        System.out.print("Nama Awal: ");
        String namaAwal = input.nextLine();
        System.out.print("Nama Akhir: ");
        String namaAkhir = input.nextLine();
        int indeks = bank.searchNasabah(namaAwal, namaAkhir);
        if (indeks != -1) {
            Nasabah nasabah = bank.getNasabah(indeks);
            if (nasabah.getTabungan() == null) {
                System.out.println("Nasabah tidak memiliki tabungan.");
            } else {
                System.out.print("Jumlah diambil: ");
                int jumlah = input.nextInt();
                if (nasabah.getTabungan().ambilUang(jumlah)) {
                    System.out.println("Uang diambil.");
                } else {
                    System.out.println("Saldo tidak cukup.");
                }
            }
        } else {
            System.out.println("Nasabah tidak ditemukan.");
        }
    }
}