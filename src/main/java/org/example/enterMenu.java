package org.example;

import java.util.Scanner;

public class enterMenu {
    public static void entermenu(){
        Scanner ints = new Scanner(System.in);
        System.out.println("1. Kurslarni korish.");
        System.out.println("2. Royxatdan otish.");
        System.out.println("3. Kirish.");
        System.out.println("0. Chiqish.");
        System.out.print(">");
        int enterMenusc = ints.nextInt();

        switch (enterMenusc){
            case 1:
                showCurrencyMenu.showcurrencymenu();
                break;
            case 2:
                RegisterMenu.registermenu();
                break;
            case 3:
                loginMenu.loginmenu();
                break;
            case 0:
                for (int i = 0; i < 100; i++) {
                    System.out.print("//////////");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
                break;
        }



    }
}
