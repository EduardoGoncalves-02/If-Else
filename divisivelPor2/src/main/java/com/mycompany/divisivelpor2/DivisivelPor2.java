/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.divisivelpor2;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class DivisivelPor2 {

    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para verificarmos: "));

        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, num + " é divisível por 2.");
        } else {
            JOptionPane.showMessageDialog(null, num + " não é divisível por 2");
        }
    }
}
