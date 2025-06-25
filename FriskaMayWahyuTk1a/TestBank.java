/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;

public class TestBank {

    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat objek Bank
        Bank bank = new Bank();

        // Menambahkan nasabah (isi diubah agar berbeda)
        bank.tambahNasabah("Alya", "Ramadhani", new Tabungan(25000)); // Nasabah dengan tabungan
        bank.tambahNasabah("Bagas", "Saputra");                        // Nasabah tanpa tabungan
        bank.tambahNasabah("Citra", "Anggraini", new Tabungan(18000)); // Nasabah dengan tabungan
        bank.tambahNasabah("Dian", "Wicaksono", new Tabungan(30000));  // Nasabah dengan tabungan
        bank.tambahNasabah("Dian", "Lestari");                         // Nasabah tanpa tabungan
        bank.tambahNasabah("Bagas", "Pradana", new Tabungan(21000));   // Nasabah dengan tabungan

        // Tampilkan semua nasabah
        System.out.println("=== Daftar Lengkap Nasabah Bank ===");
        for (int i = 0; i < bank.getJumlahNasabah(); i++) {
            Nasabah nasabah = bank.getNasabah(i);
            System.out.println("Indeks " + i + ": " + nasabah);
        }
        System.out.println("Total jumlah nasabah saat ini: " + bank.getJumlahNasabah());

        // Informasi nasabah pada indeks ke-3
        System.out.println("\nInformasi nasabah pada indeks ke-3:");
        Nasabah nasabahIndeks3 = bank.getNasabah(3);
        if (nasabahIndeks3 != null) {
            System.out.println(nasabahIndeks3);
        } else {
            System.out.println("Nasabah tidak ditemukan pada indeks ke-3.");
        }

        // Mencari nasabah dengan nama Citra Anggraini
        System.out.println("\nMencari nasabah dengan nama Citra Anggraini:");
        int indeksCandra = bank.searchNasabah("Citra", "Anggraini");
        if (indeksCandra != -1) {
            System.out.println("Nasabah ditemukan pada indeks: " + indeksCandra);
            System.out.println(bank.getNasabah(indeksCandra));
        } else {
            System.out.println("Nasabah dengan nama Citra Anggraini tidak ditemukan.");
        }

        // Mencari nasabah dengan nama awal Dian
        System.out.println("\nMencari nasabah dengan nama awal Dian:");
        int[] indeksDede = bank.searchNasabah("Dian");
        if (indeksDede.length > 0) {
            System.out.println("Nasabah dengan nama awal Dian ditemukan pada indeks:");
            for (int indeks : indeksDede) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Dian.");
        }

        // Mencari nasabah dengan nama awal Bagas
        System.out.println("\nMencari nasabah dengan nama awal Bagas:");
        int[] indeksBudi = bank.searchNasabah("Bagas");
        if (indeksBudi.length > 0) {
            System.out.println("Nasabah dengan nama awal Bagas ditemukan pada indeks:");
            for (int indeks : indeksBudi) {
                System.out.println("Indeks " + indeks + ": " + bank.getNasabah(indeks));
            }
        } else {
            System.out.println("Tidak ada nasabah dengan nama awal Bagas.");
        }
    }
}
