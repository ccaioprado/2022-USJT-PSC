public class TesteImpressora{
	public static void main(String[] args){
		Impressora teste = new Impressora();
		
		//um único float
		teste.exibir(3.5f);
		//dois floats
		teste.exibir(3.5f,3.1415f);
		//um float e uma String, nessa ordem
		teste.exibir(-1.7f,"Numero negativo");
		// uma String e um float, nessa ordem
		teste.exibir("Mostra um float",1.4f);
		//três Strings
		teste.exibir("Esse","eh","um teste");
		//dois ints e uma String, nessa ordem
		teste.exibir(1,2,"Esses sao inteiros");		
	}
}	