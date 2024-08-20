package org.example;

import java.util.Scanner;

import static org.example.RegisterMenu.EMAIL;
import static org.example.RegisterMenu.PASSWORD;

public class loginMenu {
    RegisterMenu registerMenu = new RegisterMenu();
    public static void loginmenu(){
        Scanner strings = new Scanner(System.in);
        System.out.println("Email kriting");
        System.out.print(">");
        String em = strings.nextLine();
        System.out.println("Password kriting");
        System.out.print(">");
        String ps  = strings.nextLine();
        if(em.equals(EMAIL) && ps.equals(PASSWORD) ){
             indexMenu.indexmenu();
        }else {
            System.out.println("Xato!");
            enterMenu.entermenu();
        }

    }

}
