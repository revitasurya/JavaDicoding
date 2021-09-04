package com.dicoding.javafundamental.inputoutput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class UserBufferReader {
    public static void main(String[] args){
        InputStreamReader streamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(streamReader);
        System.out.println("Program penjumlahan super sederhana");

        int value = 0;
        int anotherValue = 0;
        String nama="";
        try{
            System.out.print("Masukkan angka pertama: ");
            value = Integer.parseInt(bufferedReader.readLine());
            System.out.print("Masukkan angka kedua: ");
            anotherValue = Integer.parseInt(bufferedReader.readLine());
            //kalo inputannya string
            System.out.print("Masukkan namamu: ");
            nama = bufferedReader.readLine();
        } catch (IOException e){
            e.printStackTrace();
        }

        int result = value + anotherValue;
        System.out.println("Hasilnya adalah:" +result);
        //output string
        System.out.println("Namamu: "+nama);
    }
}
