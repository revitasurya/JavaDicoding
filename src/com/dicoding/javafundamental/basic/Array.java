package com.dicoding.javafundamental.basic;

public class Array {

    void cobaArray(){
        //deklarasi
        double[] arrA;
        double[] arrB = new double[10];
        //berapa panjangnya?
        arrA = new double[10];
    }

    //deklarasi array 1
    public static void belajarArray(){
        int[] arrInt = new int[]{1,2,3,4,5,6};
        for(int jimin=0;jimin<arrInt.length;jimin++){
            System.out.println(arrInt[jimin]);
        }
    }

    //deklarasi array 2
    public static void arrayKedua(){
        int[] arrInt2 = new int[6];
        for(int kth=0;kth<arrInt2.length;kth++){
            arrInt2[kth]=kth;
        }
        for(int kth=0;kth<6;kth++){
            System.out.println(arrInt2[kth]);
        }
    }

    public static void cobaArray2d(){
    char[][] arrChar = new char[2][];
    arrChar[0] = new char[3];
    arrChar[1] = new char[3];

    //dimensi 1 indeksnya 1 memiliki panjang elemen 3
        arrChar[1][0] = 'J';
        arrChar[1][1] = 'I';
        arrChar[1][2] = 'M';

        arrChar[0][0] = 'K';
        arrChar[0][1] = 'T';
        arrChar[0][2] = 'H';

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 0
        System.out.println("Dimensi 1 dg indeks 0 dan dimensi 2 dengan indeks 0: "+ arrChar[0][0]);
        System.out.println("Dimensi 1 dg indeks 0 dan dimensi 2 dengan indeks 1: "+ arrChar[0][1]);
        System.out.println("Dimensi 1 dg indeks 0 dan dimensi 2 dengan indeks 2: "+ arrChar[0][2]);

        // Tampilkan semua data dari dimensi 1 yang memiliki indeks 1
        System.out.println("Dimensi 1 dg indeks 1 dan dimensi 2 dengan indeks 0:" + arrChar[1][0]);
        System.out.println("Dimensi 1 dg indeks 1 dan dimensi 2 dengan indeks 1:" + arrChar[1][1]);
        System.out.println("Dimensi 1 dg indeks 1 dan dimensi 2 dengan indeks 2:" + arrChar[1][2]);
    }

    public static void IndexOutOfBound(){
        int[] arrC = {1,2,3,4};
        System.out.println(arrC[4]);
    }

    public static void main(String[] args){
        Array.arrayKedua();
        Array.cobaArray2d();
        Array.IndexOutOfBound();
    }
}
