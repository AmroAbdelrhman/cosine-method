/*
 * Amro Abdelrhman
 * Math Mehtod
 * 21/02/2020
 */
package cosmethod;

import java.util.Scanner;

/**
 *
 * @author Amro
 */
public class Cosmethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("please enter your number here");
        double num1 = input.nextDouble();
        System.out.println(Math.cos(num1));
    }
    
}