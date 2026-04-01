/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.maiorque10;

import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class MaiorQue10 {

    public static void main(String[] args) {
        int a,b, soma;
        
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número para a soma:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número para a soma:"));
        
        soma = a + b;
        
        if (soma > 10){
            JOptionPane.showMessageDialog(null, "A soma dos dois números é maior que dez, total da soma: " + soma);
        }else{
            JOptionPane.showMessageDialog(null, "A soma não é maior que dez.");
        }
    }
}
