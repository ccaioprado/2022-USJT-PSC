public class Impressora{
	public void exibir(float numero){
		System.out.println(numero);
	}
	public void exibir(float numero1,float numero2){
		System.out.println(numero1 + "," + numero2);
	}
	public void exibir(float numero1,String texto){
		System.out.println(numero1 + "," + texto);
	}
	public void exibir(String texto,float numero1){
		System.out.println(texto + "," + numero1);
	}
	public void exibir(String texto_a,String texto_b,String texto_c){
		System.out.println(texto_a + "," + texto_b + "," + texto_c);
	}
	public void exibir(int numero_a,int numero_b,String texto_a){
		System.out.println(numero_a + "," + numero_b + "," + texto_a);
	}	
}