package com.juaracoding;

public class SegitigaGanjil {
    public static void main(String[] args) {
        int n = 9; // Angka maksimal yang ingin dicetak
        int count = n; // Mulai dengan angka 10
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= count; j++) {
                if (j % 2 != 0) { // Cek apakah angka tersebut ganjil
                    System.out.print(j);
                } else {
                    System.out.print("_"); // Jika angka tersebut genap, gantikan dengan _
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
            count--; // Kurangi 1 untuk baris berikutnya
        }
    }
}