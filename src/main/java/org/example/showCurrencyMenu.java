package org.example;

import java.util.Scanner;

public class showCurrencyMenu {
    public static void showcurrencymenu(){
        Scanner ints = new Scanner(System.in);
        System.out.println("   USD = 12.420,0 SUM");
        System.out.println("   EUR = 13.600,0 SUM");
        System.out.println("   RUB = 142,0 SUM");
        System.out.println("0. Orqaga ");
        System.out.print(">");
        int kurs = ints.nextInt();
        if(kurs == 0){
            enterMenu.entermenu();
        }else {
showCurrencyMenu.showcurrencymenu();
        }
    }
}
