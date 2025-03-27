package com.juaracoding;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("JuaraCoding");
        int x = 10;

        // scope if
        if (true) {
            System.out.println("Statement IF");
            System.out.println(x);
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(x);
        }
    }
}