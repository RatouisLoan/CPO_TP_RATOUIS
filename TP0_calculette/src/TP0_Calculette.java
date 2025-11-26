*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TP0_calculette;

import java.util.Scanner ;


/**
 *
 * @author Loan RATOUIS
 */
public class TP0_Calculette {

    /**
     */
    public class TP0_calculette {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            float resultat = 0;

            System.out.println("""
                               Please enter the operator:
                               1) add
                               2) substract
                               3) multiply
                               4) divide
                               5) modulo""");

            int operateur = sc.nextInt();

            System.out.println("Please enter the first number:");
            float operande1 = sc.nextFloat();

            System.out.println("Please enter the second number:");
            float operande2 = sc.nextFloat();

            switch (operateur) {
                case 1:
                    resultat = operande1 + operande2;
                    break;
                case 2:
                    resultat = operande1 - operande2;
                    break;
                case 3:
                    resultat = operande1 * operande2;
                    break;
                case 4:
                    if (operande2 != 0) {
                        resultat = operande1 / operande2;
                    } else if (operateur == 5) {
                        if (operande2 != 0) {
                            resultat = operande1 % operande2;
                        }
                    }   System.out.println("Résultat : " + resultat);
                    break;
                default:
                    break;
            }
        }
    }
}