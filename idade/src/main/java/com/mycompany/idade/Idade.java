/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.idade;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Idade {

    public static void main(String[] args) {
        int ano, idade;

        ano = Integer.parseInt(JOptionPane.showInputDialog("Em que ano você nasceu? "));

        idade = 2026 - ano;

        if (ano > 2026) {
            JOptionPane.showMessageDialog(null, "Você nem nasceu ainda.");
        } else {
            if (ano < 0) {
                JOptionPane.showMessageDialog(null, "Ano inválido");
            } else {
                JOptionPane.showMessageDialog(null, "Você tem " + idade + " anos");
            }
        }
    }
}
