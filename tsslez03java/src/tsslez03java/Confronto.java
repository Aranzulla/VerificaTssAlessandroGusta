/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsslez03java;

import java.util.Scanner;

/**
 *
 * @author tss
 */
public class Confronto {

    //Leggere in Input due numeri interi e stampare il massimo
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Inserire il primo numero: ");
        int op1 = s.nextInt();

        System.out.println("Inserire il secondo numero: ");
        int op2 = s.nextInt();
        if (op1 == op2) {
            System.out.println("I numeri sono uguali !!!");
        } else {
            if (op1 > op2) {
                System.out.println("Il massimo è: " + op1);
            } else {
                System.out.println("Il massimo è: " + op2);
            }
        }

    }
}
