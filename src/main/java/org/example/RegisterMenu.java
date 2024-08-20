package org.example;

import java.util.Scanner;

public class RegisterMenu {
    public static String FISH  = "";
    public static String TEL   = "";
    public static String EMAIL = "";
    public static String KARTARAQAM  = "";
    public static String PASSWORD  = "";
    public static void registermenu(){
        Scanner ints = new Scanner(System.in);
        Scanner strings = new Scanner(System.in);
        System.out.println("1. F.I.SH");
        System.out.println("2. Telefon nomer");
        System.out.println("3. Email");
        System.out.println("4. Kartaraqam");
        System.out.println("5. Password");
        System.out.println("0. Orqaga");
        System.out.print(">");
        int reg = ints.nextInt();

        switch (reg){
            case 1:
                System.out.println("F.I.SH kriting");
                System.out.print(">");
                FISH = strings.nextLine();
                RegisterMenu.registermenu();
                break;
            case 2:
                System.out.println("Telefon raqam kriting");
                System.out.print(">");
                TEL = strings.nextLine();
                RegisterMenu.registermenu();
                break;
            case 3:
                System.out.println("Email kriting");
                System.out.print(">");
                EMAIL = strings.nextLine();
                RegisterMenu.registermenu();
                break;
            case 4:
                System.out.println("Karta raqam kriting");
                System.out.print(">");
                KARTARAQAM = strings.nextLine();
                RegisterMenu.registermenu();
                break;
            case 5:
                System.out.println("Password kriting");
                System.out.print(">");
                PASSWORD = strings.nextLine();
                RegisterMenu.registermenu();
                break;
            case 0:
                enterMenu.entermenu();
                break;
            default:
                System.out.println("Error");
                registermenu();
    }
}
}
