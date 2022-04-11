package com.company;

public class Task5 {
    public static void main(String[] args) {
        int num = 0;
        for (int o = 0; o <= 2; o++){
            for (int s = 0; s <= 9; s++){
                for (int t = 0; t <= 5; t++){
                    for (int f = 0; f <= 9; f++){
                        if (o == 2 && s < 4){
                            continue;
                        }
                        if ((o == t && s == f) || (o == f && s == t)){
                            num++;

                        }
                    }
                }
            }
        }
        System.out.println("Співпадінь: " + num);
    }
}
