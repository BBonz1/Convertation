package org.example;

import java.util.Scanner;

public class chooseCurrency1 {
    public static void choosecurrency1(){
        Scanner ints = new Scanner(System.in);
        System.out.println("Qaysi valyuta birligidan:");
        System.out.println("1. SUM");
        System.out.println("2. EUR");
        System.out.println("3. RUB");
        System.out.println("4. USD");
        System.out.println("0. Orqaga");
        System.out.print(">");
        int chs1 = ints.nextInt();
        chooseCard1.choosecard1();
    }
}
