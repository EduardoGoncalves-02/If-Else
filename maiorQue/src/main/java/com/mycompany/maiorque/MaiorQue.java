/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.maiorque;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class MaiorQue {

    public static void main(String[] args) {
        int a, b;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número: "));

        if (a > b) {
            JOptionPane.showMessageDialog(null, a + " é maior que " + b);
        } else {
            if (b > a) {
                JOptionPane.showMessageDialog(null, b + " é maior que " + a);
            } else {
                if (a == b) {
                    JOptionPane.showMessageDialog(null, a + " é igual a " + b);
                } else {
                    JOptionPane.showMessageDialog(null, "opção inválida");
                }

            }

        }
    }
}
