/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsslez04java;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Pari {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Inserire il primo numero: ");
        int n1 = s.nextInt();

        //float risultato = n1 / 2f; per ottenere i numeri con la virgola.
        //System.out.println(String.format("Il risultato contiene: %s ", risultato));
        int resto = n1 % 2;

        if (resto == 0) {
            System.out.println("il numero è pari");
        } else {
            System.out.println("il numero è dispari");
        }
    }
}
