/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.divisivelpor_10_5_2;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class DivisivelPor_10_5_2 {

    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificarmos: "));

        if (num % 10 == 0) {
            JOptionPane.showMessageDialog(null, num + " é divisível por 10.");

        } else {
            if (num % 5 == 0) {
                JOptionPane.showMessageDialog(null, num + " é divisível por 5.");

            } else {
                if (num % 2 == 0) {
                    JOptionPane.showMessageDialog(null, num + " é divisível por 2.");

                } else {
                    JOptionPane.showMessageDialog(null, num + " não é divisível nem por 10, 5 ou 2.");
                }
            }
        }
    }
}
