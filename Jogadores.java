public class Jogadores{
	private String nome;
	private String time;
	private int idade;
	//Inicia os métodos Setters
	public void setNome(String nome){
		this.nome = new String(nome);
	}
	public void setTime(String time){
		this.time = new String(time);
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	//Inicia os métodos Getters
	public String getNome(){
		return this.nome;
	}
	public String getTime(){
		return this.time;
	}
	public int getIdade(){
		return this.idade;
	}
}