package Empresa;

public class Restaurante extends Empresa {
	
	private String comida; 
	private double precoMedio;
	
	public Restaurante() {
		super();
		this.comida = "-";
		this.precoMedio = 0; 
		// TODO Auto-generated constructor stub
	}
	public Restaurante(String nome, String endereco, String cidade, String estado, String cep, String telefone, String comida, double precoMedio) {
		super(nome, endereco, cidade, estado, cep, telefone);
		this.comida = comida;
		this.precoMedio = precoMedio; 
		
		
		// TODO Auto-generated constructor stub
	}
	public String getComida() {
		return comida;
	}
	public void setComida(String comida) {
		this.comida = comida;
	}
	public double getPrecoMedio() {
		return precoMedio;
	}
	public void setPrecoMedio(double precoMedio) {
		this.precoMedio = precoMedio;
	}
	
	public String imprime() {
		
		return "\nNome: \t" +this.getNome()+ "\nEndereco: \t"+this.getEndereco()+ "\nCidade: \t"+this.getCidade()+ "\nEstado: \t"+this.getEstado()+"\n CEP: \t"+this.getCep()+ "\nTelefone: \t"+this.getTelefone()+ "\nTipo de Comida:\t" +this.getComida()+ "\nPreco Medio:\t" +this.getPrecoMedio()+  " "; 
		
	}
	@Override
	public String toString() {
		return "Restaurante [comida=" + comida + ", precoMedio=" + precoMedio + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
