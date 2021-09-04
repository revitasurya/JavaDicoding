package com.dicoding.javafundamental.inputoutput;
import java.util.Scanner;

public class InputOutputFunc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program penjumlahan sederhana");
        System.out.print("Masukkan angka pertamamu: ");
        int value = scanner.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int anotherValue = scanner.nextInt();
        System.out.print("Spill nama qm dong: ");
        String nama = scanner.next();
        int result = value + anotherValue;
        System.out.println("Hasilnya adalah ="+result+" yaaa "+nama);
    }
}
