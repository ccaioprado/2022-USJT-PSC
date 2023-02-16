/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversor;

/**
 *
 * @author Trabalho
 */
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;


public class ConversorDeTemperatura {
    
    public static void criarTela(){
        //Cria um frame para Tela
        JFrame tela = new JFrame("Conversor");
        JTextField celsiusTextField = new JTextField(10);
        JLabel celsiusLabel = new JLabel("\u00B0C");
        JButton convertButton = new JButton("Converter");
        JLabel valorConvertidoLabel = new JLabel("");
        //Criar painel de conteudo
        Container painelDeConteudo = tela.getContentPane();
        painelDeConteudo.setLayout(new GridLayout(2,4,2,4));
        painelDeConteudo.add(celsiusTextField);
        painelDeConteudo.add(celsiusLabel);
        painelDeConteudo.add(convertButton);
        painelDeConteudo.add(valorConvertidoLabel);
        
        convertButton.addActionListener((e) -> {
            double celsius = Double.parseDouble(celsiusTextField.getText());
            double fahrenheit = celsius / 5 * 9 + 32;
            valorConvertidoLabel.setText(
                    String.format("%.2f\u00B0F", fahrenheit)
            );        
        });
        
        //Ajuste da tela
        tela.pack();
        //Centralizar a tela
        tela.setLocationRelativeTo(null);
        //Alterar o comportamento do botão fechar
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //tornar a tela visível
        tela.setVisible(true);      
        
    
    }
    public static void main(String[] args){
        
        SwingUtilities.invokeLater(() -> {
            criarTela();
        });
        
        
    }
    
}
