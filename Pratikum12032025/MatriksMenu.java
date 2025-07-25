/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum12032025;

/**
 *
 * @author frisk
 */
import java.util.Random;
import java.util.Scanner;
public class MatriksMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        char ulang = 'y';
        int pilih, baris, kolom;
        int M1[][], M2[][], hasil[][]; //M=matriks
        
        do {
            System.out.println("===== Operasi Matriks =====");
            System.out.println("1. Tambah\n2. Kurang\n3. Kali\n4. Identitas\n5. Transpose\n6. Exit");
            System.out.print("Pilih program (1-6): ");
            pilih = input.nextInt();
            
            if (pilih == 6) {
                System.out.println("Anda telah keluar dari program.");
                break;
            }
            
            if (pilih < 1 || pilih > 6) {
                System.out.println("Pilihan tidak ada di menu.");
                System.out.print("Apakah ingin mengulang program? (y/n): ");
                ulang = input.next().charAt(0);
                continue;
            }
            
            System.out.print("Masukkan jumlah baris: ");
            baris = input.nextInt();
            System.out.print("Masukkan jumlah kolom: ");
            kolom = input.nextInt();
            
            M1 = new int[baris][kolom];
            M2 = new int[baris][kolom];
            hasil = new int[baris][kolom];
            
            System.out.println("Matriks 1:");
            for (int i = 0; i < baris; i++) {
                for (int j = 0; j < kolom; j++) {
                    M1[i][j] = rand.nextInt(50) + 1;
                    System.out.print(M1[i][j] + "\t");
                }
                System.out.println();
            }
            
            if (pilih != 4 && pilih != 5) {
                System.out.println("Matriks 2:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        M2[i][j] = rand.nextInt(50) + 1;
                        System.out.print(M2[i][j] + "\t");
                    }
                    System.out.println();
                }
            }
            
            if (pilih == 1) {
                System.out.println("Hasil Penjumlahan:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[i][j] = M1[i][j] + M2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (pilih == 2) {
                System.out.println("Hasil Pengurangan:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        hasil[i][j] = M1[i][j] - M2[i][j];
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (pilih == 3) {
                System.out.println("Hasil Perkalian:");
                for (int i = 0; i < baris; i++) {
                    for (int j = 0; j < kolom; j++) {
                        for (int k = 0; k < kolom; k++) {
                            hasil[i][j] += M1[i][k] * M2[k][j];
                        }
                        System.out.print(hasil[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else if (pilih == 4) {
                if (baris != kolom) {
                    System.out.println("Matriks harus persegi untuk menjadi identitas.");
                } else {
                    System.out.println("Matriks Identitas:");
                    for (int i = 0; i < baris; i++) {
                        for (int j = 0; j < kolom; j++) {
                            hasil[i][j] = (i == j) ? 1 : 0;
                            System.out.print(hasil[i][j] + "\t");
                        }
                        System.out.println();
                    }
                }
            } else if (pilih == 5) {
                System.out.println("Transpose Matriks 1:");
                for (int i = 0; i < kolom; i++) {
                    for (int j = 0; j < baris; j++) {
                        System.out.print(M1[j][i] + "\t");
                    }
                    System.out.println();
                }
            }
            
            System.out.print("Apakah ingin mengulang program? (y/n): ");
            ulang = input.next().charAt(0);
        } while (ulang == 'y');
    }
    
}
