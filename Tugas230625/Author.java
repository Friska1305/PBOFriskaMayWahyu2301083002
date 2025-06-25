/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas230625;

/**
 *
 * @author frisk
 */
public class Author {
    private String nama;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.nama = nama;
        this.email = email;
        this.gender = gender;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return nama + " (" + gender + ") at " + email;
    }
}

