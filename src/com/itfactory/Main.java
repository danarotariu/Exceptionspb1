package com.itfactory;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Citeste cuvant: ");
        try {
            String text = citesteCuvant();
            System.out.println(text);
        } catch (ExceptiaMea var2) {
            var2.printStackTrace();
        }
    }

    public static String citesteCuvant() throws ExceptiaMea {
       Scanner scanner = new Scanner(System.in);
        String mesaj = scanner.nextLine();
        while (!( mesaj.equalsIgnoreCase("pruna")) || !(mesaj.equalsIgnoreCase("pupaza"))) {
            System.out.print("Citeste cuvant: ");
             mesaj = scanner.nextLine();
            if (mesaj.equalsIgnoreCase("pruna")|| mesaj.equalsIgnoreCase("pupaza") ){
                throw new ExceptiaMea ("Ati introdus cuvantul: " + mesaj);
            }
        }
        return mesaj;
    }
}