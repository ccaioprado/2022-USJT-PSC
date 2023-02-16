import javax.swing.JOptionPane;
public class CalculaComissao{
	public static void main(String[] args){
		double precoUnitario, quantidadeVendida;
		//entrada
		precoUnitario = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da peça"));
		quantidadeVendida = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de peças"));
		//processamento (opecações realizadas) e saída
		JOptionPane.showMessageDialog(null,"O valor da comissão é: R$ " + (precoUnitario * quantidadeVendida * 0.05));		
	}
}