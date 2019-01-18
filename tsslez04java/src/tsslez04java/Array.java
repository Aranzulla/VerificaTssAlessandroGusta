/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsslez04java;

/**
 *
 * @author tss
 */
public class Array {

    public static void main(String[] args) {
        //dichiarazione array di interi
        int[] numeri;
        //creazione di un array di 100 numeri
        numeri = new int[100];
        
        for (int i = 0; i < numeri.length; i++) {
            int elemento = numeri[i];
        }
        //forma abbreviata 2
        //int[] numeri1 = {10,20,30,40};
        //forma abbreviata
        //int[] numeri1 = new int[100];
        stampa(numeri);
        
        //stampa(numeri1);
    }

//function in java
    public static void stampa(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int valore = i + 1;
            System.out.println(String.format("Numeri[%s] = %s", i, valore));
        }
    }

}
