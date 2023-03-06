package lab0.ex4ao9;

public class Corredor extends Atleta{

	public Corredor(String nome, int idade, double peso, double altura) {
		super(nome, idade, peso, altura);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void jogar() {
		System.out.println("Estou correndo!");
		
	}


	 
}
