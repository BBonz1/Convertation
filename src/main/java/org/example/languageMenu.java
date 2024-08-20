package org.example;

import java.util.Scanner;

public class languageMenu {
    public static void Menu(){
        Scanner ints = new Scanner(System.in);
        System.out.println("1. UZB");
        System.out.println("2. RUS");
        System.out.println("3. ENG");
        System.out.print("> ");
        int MenuLangue = ints.nextInt();
        enterMenu.entermenu();


    }
}
