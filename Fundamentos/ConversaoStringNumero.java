package Fundamentos;

import javax.swing.*;
import java.math.BigDecimal;

public class ConversaoStringNumero {
    public static void main(String[] args) {

        // Janela Visual
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primeiro número");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número");

        System.out.println(valor1+valor2);

        double numero1 = Double.parseDouble(valor1); //Convertendo para double
        double numero2 = Double.parseDouble(valor2); //Convertendo para double

        double soma = numero1 + numero2;
        System.out.println("Soma é "+soma);
        System.out.println("Média é " + soma / 2);


    }
}
