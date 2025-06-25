/*
 * Friska May WAhyu
 * TK 1A
 * 2301083002
 */
package FriskaMayWahyuTk1a;

/**
 *
 * @author frisk
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Membuat dua objek Nasabah
        Nasabah nasabah1 = new Nasabah("Naya", "Didi");
        Tabungan tabungan1 = new Tabungan(10000); // Saldo awal: 10,000
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Jojo", "Susi");
        Tabungan tabungan2 = new Tabungan(8000); // Saldo awal: 8,000
        nasabah2.setTabungan(tabungan2);

        // Menampilkan informasi setiap nasabah
        System.out.println("Nasabah 1: " + nasabah1);
        System.out.println("Nasabah 2: " + nasabah2);

        // Nasabah 1 menabung
        nasabah1.getTabungan().simpanUang(4000); // Menambah saldo sebesar 4,000
        System.out.println("Saldo Nasabah 1 setelah menabung: " + nasabah1.getTabungan().getSaldo());

        // Nasabah 2 menabung
        nasabah2.getTabungan().simpanUang(7000); // Menambah saldo sebesar 7,000
        System.out.println("Saldo Nasabah 2 setelah menabung: " + nasabah2.getTabungan().getSaldo());

        // Nasabah 1 mengambil uang
        if (nasabah1.getTabungan().ambilUang(5000)) {
            System.out.println("Saldo Nasabah 1 setelah mengambil uang: " + nasabah1.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 1 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        // Nasabah 2 mengambil uang
        if (nasabah2.getTabungan().ambilUang(6000)) {
            System.out.println("Saldo Nasabah 2 setelah mengambil uang: " + nasabah2.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 2 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        // Nasabah 2 mentransfer uang ke Nasabah 1
        if (nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000)) {
            System.out.println("Transfer berhasil.");
        } else {
            System.out.println("Transfer gagal. Saldo Nasabah 2 tidak mencukupi.");
        }

        // Menampilkan saldo akhir
        System.out.println("Saldo akhir Nasabah 1: " + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir Nasabah 2: " + nasabah2.getTabungan().getSaldo());
    }
}


  