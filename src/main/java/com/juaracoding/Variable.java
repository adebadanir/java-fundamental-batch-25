package com.juaracoding;

import java.awt.*;

public class Variable {
    public static void main(String[] args) {

    byte rating = 127;
    short stock = 1000;

    char a = 'A';

    String path = "C:\\Users\\Lenovo\\Onedrive\\Gambar\\open-ai.jpg";
    System.out.println(path.toUpperCase());

    boolean isAvailable = false;

    // implementasi ke account/users
     String firstName = "Ade Ba\'dani";
     String lastName = "Ramdhan";
     String address = "Bogor";
     long phoneNumber = 8_123_123_123L;
     String avatar = "https://imageUrl.com";
     short zipCode = 1233;
     char level = 'A';
     boolean isLogin = true;
     boolean isActive  = true;

     // casting implicit
     int price = 1_000_000_000;
     long total = 3_000_000_000L + price;
     System.out.println(total);
     int intLevel = level;
     System.out.println(intLevel);

     //casting explicit
        long l = 1231234324234234L;
        int i = (int) l;
        System.out.println(i);

        //passing by value
        int umur = 81;
        int duplikatUmur = umur;
        duplikatUmur = 1308;
        System.out.println(umur);
        System.out.println(duplikatUmur);

        //passing by reference
        Rectangle kotak = new Rectangle(20, 30);
        Rectangle duplikatKotak = kotak;
        duplikatKotak.setSize(80,90);

        System.out.println(kotak.getSize());
        System.out.println(duplikatKotak.getSize());
    }
}
