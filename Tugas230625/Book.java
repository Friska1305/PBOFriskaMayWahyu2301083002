/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas230625;

/**
 *
 * @author frisk
 */
public class Book {
    private String nama;
    private Author author;
    private double harga;
    private int qty;

    public Book(String nama, Author author, double harga, int qty) {
        this.nama = nama;
        this.author = author;
        this.harga = harga;
        this.qty = qty;
    }

    public String getNama() {
        return nama;
    }

    public Author getAuthor() {
        return author;
    }

    public double getHarga() {
        return harga;
    }

    public int getQty() {
        return qty;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "'" + nama + "' by " + author.toString();
    }
}

