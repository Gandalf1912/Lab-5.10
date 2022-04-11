package com.company;

public class Task1 {

    public static void main(String[] args) {
        System.out.println("Оператор циклу: for");

        for(int i = 500; i <= 650; i += 10){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Оператор циклу: while");

        int i1, i2;
        i1 = 500;
        while (i1 <= 650){
            System.out.print(i1 + " ");
            i1 += 10;
        }

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Оператор циклу: do-while");

        i2 = 500;
        do{
            System.out.print(i2 + " ");
            i2 += 10;
        }
        while (i2 <= 650);
    }
}
