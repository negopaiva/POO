package Politico;

public class Prefeito extends Politico {
		private String cidade; 

	public Prefeito() {
		super();
		cidade = "-"; 
		// TODO Auto-generated constructor stub
	}

	public Prefeito(String nome, String cpf, String partido, String cidade) {
		super(nome, cpf, partido);
		this.cidade = cidade; 
		// TODO Auto-generated constructor stub
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + "Prefeito da cidade:\t" + this.cidade +   "\n";
	}
	
	
	
	

}
