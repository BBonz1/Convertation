package org.example;

import java.util.Scanner;

public class indexMenu {
    public static void indexmenu(){
        Scanner ints = new Scanner(System.in);
        System.out.println("1. Konversatsiya bolimi");
        System.out.println("2. Kartalarni boshqarish");
        System.out.println("3. Tarixni korish");
        System.out.println("0. Orqaga");
        System.out.print(">");
        int indx = ints.nextInt();
        switch (indx){
            case 1:
                chooseCurrency1.choosecurrency1();
                break;
            case 2:
                break;
            case 3:
                break;
            case 0:
                enterMenu.entermenu();
                break;
            default:
                System.out.println("Error");
                indexMenu.indexmenu();

        }


    }
}
