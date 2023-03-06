package lab0.ex4ao9;

public class Futebolista extends Atleta  {

	public Futebolista(String nome, int idade, double peso, double altura) {
		super(nome, idade, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jogar() {
		System.out.println("Estou jogando futebol!");
		
	}

}
