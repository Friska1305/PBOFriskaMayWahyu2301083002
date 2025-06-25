/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas230625;

/**
 *
 * @author frisk
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Book> daftarBuku = new ArrayList<>();

        System.out.println("=== Program Pendataan Buku dan Penulis ===");

        String lanjut;
        do {
            // Input data penulis
            System.out.println("\n>> Input Data Penulis <<");
            System.out.print("Nama Penulis: ");
            String nama = input.nextLine();

            System.out.print("Email Penulis: ");
            String email = input.nextLine();

            System.out.print("Jenis Kelamin (M/F): ");
            char gender = input.next().charAt(0);
            input.nextLine(); // hapus newline

            Author author = new Author(nama, email, gender);

            // Input data buku
            System.out.println(">> Input Data Buku <<");
            System.out.print("Judul Buku: ");
            String judul = input.nextLine();

            System.out.print("Harga Buku: ");
            double harga = input.nextDouble();

            System.out.print("Jumlah Stok: ");
            int stok = input.nextInt();
            input.nextLine(); // hapus newline

            Book buku = new Book(judul, author, harga, stok);
            daftarBuku.add(buku);

            // Tanya lanjut atau tidak
            System.out.print("Ingin menambahkan buku lain? (y/n): ");
            lanjut = input.nextLine();

        } while (lanjut.equalsIgnoreCase("y"));

        // Tampilkan semua data
        System.out.println("\n=== DAFTAR BUKU YANG TELAH DIINPUT ===");
        for (int i = 0; i < daftarBuku.size(); i++) {
            Book b = daftarBuku.get(i);
            System.out.println("\nBuku ke-" + (i + 1));
            System.out.println(b.toString());
            System.out.println("Harga: Rp" + b.getHarga());
            System.out.println("Stok: " + b.getQty() + " buah");
        }
    }
}
