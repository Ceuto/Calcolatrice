package org.example;

import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int a, b;
        Calcolatrice c1 = new Calcolatrice();

        System.out.println("Inserisci due numeri");

        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        b = s.nextInt();

        System.out.println("Somma: " + c1.somma(a, b));
        System.out.println("Moltiplicazione: " + c1.moltiplicazione(a, b));

        s.close();
    }
}