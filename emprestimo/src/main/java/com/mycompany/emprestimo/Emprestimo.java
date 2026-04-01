/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.emprestimo;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Emprestimo {

    public static void main(String[] args) {
        double salario, porcentagem, parcela;
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salário? "));
        parcela = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da parcela? "));
        porcentagem = salario * 0.3;
        
        if(parcela > porcentagem){
            JOptionPane.showMessageDialog(null,"Infelizmente a parcela excede os 30% do salário, não será possível realizar o empréstimo.");
        }else {
            JOptionPane.showMessageDialog(null, "Empréstimo realizado com sucesso!");
        }
    }
}
