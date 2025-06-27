package TugasPraktikum26062025;

public class DataUser {
    public static String pin = "1234";
    public static double saldo = 500000;  // saldo awal

    public static boolean cekSaldoCukup(double jumlah) {
        return saldo >= 50000 && saldo >= jumlah;
    }
}
