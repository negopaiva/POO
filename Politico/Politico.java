package Politico;

public class Politico extends Pessoa {
	
	private String partido;

	public Politico() {
		super();
		this.partido = "-"; 
		// TODO Auto-generated constructor stub
	}

	public Politico(String nome, String cpf, String partido) {
		super(nome, cpf);
		this.partido = partido; 
		
		// TODO Auto-generated constructor stub
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	@Override
	public String toString() {
		return "Politico\n\n Partido:\t" + partido + " \n Nome:\t" + getNome() + " \n Cpf:\t" + getCpf() + "\n";
	}

	
	
	
	
	

}
