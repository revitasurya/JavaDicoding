package com.dicoding.javafundamental.percabangan;

import java.util.Scanner;
public class Main {

    public static void SwitchWithoutBreak(){
        char input ='C';
        int output = 0;

        switch (input){
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            case 'D':
                output++;
            case 'E':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah: "+output);
    }

    public static void ifElse(){
        boolean isOn = true;

        if(isOn == false){
            System.out.println("Menyalakan lampu");
        }else{
            System.out.println("Mematikan lampu");
        }
    }

    //bikin segitiga pake for sarang
    public static void forBersarang(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan tinggi segitiga: ");
        int a = scanner.nextInt();
        for (int i=0;i<=a;i++){
            for (int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void While(){
        int value = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas urutan angka");
        int batasAtas = scanner.nextInt();
        while (value <= batasAtas){
            System.out.print("Angka: "+value);
            value++;
            System.out.print("\n");
        }
    }

    public static void doWhile(){
        int value = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan batas urutan angka:");
        int batasAtas = scanner.nextInt();
        //lakukan dulu baru cek kondisi
        do{
            System.out.print("Angka: "+value);
            value++;
            System.out.print("\n");
        } while(value <= batasAtas);
    }

    public static void main(String[] args){
        //Main.SwitchWithoutBreak();
        //Main.forBersarang();
        Main.doWhile();
    }
}
