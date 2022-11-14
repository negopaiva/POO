package Politico;

public class Governador extends Politico {
	
	private String estado; 

	public Governador() {
		super();
		this.estado = "-"; 
		// TODO Auto-generated constructor stub
	}

	public Governador(String nome, String cpf, String partido, String estado) {
		super(nome, cpf, partido);
		this.estado = estado;
		// TODO Auto-generated constructor stub
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "\n" + super.toString() + " Governador do estado:\t" + estado +  "\n";
	}
	
	
}
