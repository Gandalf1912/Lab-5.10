package com.company;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Оператор циклу:  for");
        int a, b;
        a = 1;
        b = 10;
        for (int f = 1; f <= b; f++) {
            a = a * f;
        }
        System.out.println(b + "! = " + a);

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Оператор циклу:  while");

        int c, d, e;
        c = 1;
        d = 10;
        e = 1;
        while (e <= d){
            c = c * e;
            e++;
        }
        System.out.println(d + "! = " + c);
    }
}