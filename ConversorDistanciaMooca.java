
package conversor;

/**
 *
 * @author Trabalho
 */
import javax.swing.*;
import java.awt.Container;
import java.awt.GridLayout;

public class ConversorDistanciaMooca {
    public static void criarTela(){
    //Cria um frame para Tela
    JFrame tela = new JFrame("Conversor de distancia");
    JTextField centimetrosTextField = new JTextField(10);
    JLabel resultadoJLabel = new JLabel("");
    JButton milimetrosJButton = new JButton("Milimetros");
    JButton metrosJButton = new JButton("Metros");
    JButton kilometrosJButton = new JButton("Km");
    //Criar o painel de conteudo
    Container painelDeConteudo = tela.getContentPane();
    painelDeConteudo.setLayout(new GridLayout(5,1,5,1));
    painelDeConteudo.add(centimetrosTextField);
    painelDeConteudo.add(resultadoJLabel);
    painelDeConteudo.add(milimetrosJButton);
    painelDeConteudo.add(metrosJButton);
    painelDeConteudo.add(kilometrosJButton);
    //Programacao dos eventos do botão
    
    milimetrosJButton.addActionListener((e) -> {
        double centimetros = Double.parseDouble(centimetrosTextField.getText());
        resultadoJLabel.setText(
                String.format("%.2f mm.",centimetros*10.0)
        );
    
    });
    metrosJButton.addActionListener((e)-> {
        double centimetros = Double.parseDouble(centimetrosTextField.getText());
        resultadoJLabel.setText(
                String.format("%.2f m.",centimetros/100.0)
    );    
    });
    
    kilometrosJButton.addActionListener((e) ->{
        double centimetros = Double.parseDouble(centimetrosTextField.getText());
        resultadoJLabel.setText(
                String.format("%.6f km.", centimetros/100000.0)
        );    
    });
    //Ajuste da tela
    tela.pack();
    //Centralizar a tela
    tela.setLocationRelativeTo(null);
    //Alterar o comportamento do botao fechar
    tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    //tornar a tela visivel
    tela.setVisible(true);
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(() ->{
           criarTela();
       });
    }
}
