import java.util.Scanner; //Importa a classe Scanner
public class TestaJogadores{
	public static void main(String[] args){
		Scanner meuObjeto = new Scanner(System.in);
		
		Jogadores jogador1 = new Jogadores();
		Jogadores jogador2 = new Jogadores();
		
		//Iniciando o jogador1
		System.out.println("Digite o nome do primeiro jogador");
		jogador1.setNome(meuObjeto.nextLine());
		System.out.println("Digite a idade do primeiro jogador");
		jogador1.setIdade(meuObjeto.nextInt());		
		System.out.println("Digite o time do primeiro jogador");
		meuObjeto.nextLine();
		jogador1.setTime(meuObjeto.nextLine());		
		//Iniciando o jogador2
		System.out.println("Digite o nome do segundo jogador");
		jogador2.setNome(meuObjeto.nextLine());
		System.out.println("Digite a idade do segundo jogador");
		jogador2.setIdade(meuObjeto.nextInt());		
		System.out.println("Digite o time do segundo jogador");
		meuObjeto.nextLine();
		jogador2.setTime(meuObjeto.nextLine());		
		//Imprime os dados do jogador1
		System.out.println("O nome do primeiro jogador é: "
		+ jogador1.getNome() + " ele joga no " +
		jogador1.getTime() + " e tem " + jogador1.getIdade() +
		" anos.");		
		//Imprime os dados do jogador2
		System.out.println("O nome do segundo jogador é: "
		+ jogador2.getNome() + " ele joga no " +
		jogador2.getTime() + " e tem " + jogador2.getIdade() +
		" anos.");		
	}
}