package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Collection;

public class List {
    public static void main(String[] args){
        //deklrasi Array
        String[] heroes = new String[2];
        heroes[0] = "park";
        heroes[1] = "jimin";
        //heroes[2] = "jimim"; //error ArrayIndexOutOfBoundsException karena ukuran array tetap

        //menggunakan arrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercurry"); //method add()) untuk menambahkan objek ke list
        planets.add("venue");
        planets.add("earth");
        planets.add("mars");

        System.out.println("List planets awal:");
    }
}
