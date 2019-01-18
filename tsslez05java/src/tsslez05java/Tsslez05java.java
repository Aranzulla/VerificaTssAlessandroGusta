/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsslez05java;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Tsslez05java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] numeri = {12, 45, 78, 69, 23, 56, 43};

        stampa(numeri);
        Scanner s = new Scanner(System.in);

        System.out.println("il massimo è: ");
        int numMax = max(numeri);
        System.out.println(numMax);

        System.out.println("Numero da trovare: ");
        int n1 = s.nextInt();
        System.out.println(cerca(numeri, n1));
        
        System.out.println("Numeri pari: ");
        int numPari = pari();
        System.out.println(numPari);

    }

    public static void stampa(int[] array) {

        for (int numero : array) {
            System.out.println(numero);
        }

    }

    //trovare il massimo in un array di numeri
    public static int max(int[] array) {

        int massimo = 0;

        for (int i = 0; i < array.length; i++) {
            if (massimo < array[i]) {
                massimo = array[i];
            }

        }
        return massimo;
    }

//ricerca di un numero array + numero risultato true o folse
    public static boolean cerca(int[] array, int numero) {

        boolean risultato = false;

        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                risultato = true;
            }
        }
        return risultato;

    }

    //estrarre i numeri pari da un array
    public static int[] pari(int[] array) {

        int contPari = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                contPari = contPari + 1;
            }

        }
        int[] pari = new int[contPari];
        int nPari = 0;
        for (int i = 0; i < array.length; i++) {
            if (contPari % 2 == 0) {
                pari[contPari] = array[i];
                nPari = nPari + 1;
            }
        }
        return pari;

    }

    /*
    //dato un arrey non ordinato mi ri da un arrey ordinato in ordine crescente
    public static void ordina(int[] array) {

    }
     */
}
