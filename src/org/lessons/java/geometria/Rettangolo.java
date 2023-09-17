package org.lessons.java.geometria;

import java.util.Scanner;

public class Rettangolo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("RETTANGOLO PERSONALE!!!!\n");

        System.out.print("Inserisci un numero per la base: ");
        int base = sc.nextInt();

        System.out.print("\nInserisci un numero per l'altezza: ");
        int altezza = sc.nextInt();

        int perimetro = (base * 2) + (altezza * 2);

        int area = (base * altezza);

        System.out.println("\n-----\n\n" + "Perimetro: " + perimetro + "\n\nArea: " + area + "\n");

        disegno(base, altezza); // Chiama il metodo disegno con i valori di base e altezza.
        
        sc.close();
    }

    public static void disegno(int base, int altezza) {
        for (int i = 0; i < altezza; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || i == altezza - 1 || j == 0 || j == base - 1) {
                    System.out.print("o");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
