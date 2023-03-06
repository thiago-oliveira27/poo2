package lab0.ex4ao9;

public abstract class Atleta implements Comparable<Atleta> {

	 private String nome;
	 private int idade;
	 private double peso;
	 private double altura;
	 
	public Atleta(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void aquecer(int min) {
		System.out.println("Tempo de aquecimento: " + min);
		
	}
	public abstract void jogar();
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Atleta [nome=" + nome + ", idade=" + idade + ", peso=" + peso + ", altura=" + altura + "]";
	}

	  @Override
	    public int compareTo(Atleta atl) {
	        return this.nome.compareTo(atl.getNome());
	    }
	
}
