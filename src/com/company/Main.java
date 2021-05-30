package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Здравствуйте, как вас зовут?");
        Scanner s = new Scanner((System.in));
        System.out.println("Ваше имя");
        String string = s.nextLine();
        System.out.println(string + " , рад знакомству!");
    }
}
