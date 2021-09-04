package com.dicoding.javafundamental.basic;
import com.dicoding.javafundamental.basic.kendaraan.*;
import com.dicoding.javafundamental.basic.music.Gitar;
import org.apache.commons.lang3.time.DateUtils;
import java.util.Date;

public class Main {
    
    public static void main(String[] args){
        System.out.println("Hello World");

        //pake library java.util.Date
        Date today = new Date();
        System.out.println("Hari ini adalah =" +today);
        Date tomorrow = DateUtils.addDays(today,1);
        System.out.println("Besok ="+tomorrow);

        //manggil kelas lain
        StringBelajar.StringTung();
        Gitar.bunyi();
        Mobil.JumlahBan();
    }
}
