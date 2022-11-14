package Poligono;

public class Poligono {
	private double comprimento;
	private double altura;
	
	public Poligono(double comprimento, double altura) {
		super();
		this.comprimento = comprimento;
		this.altura = altura;
	}

	public Poligono() {
		// TODO Auto-generated constructor stub
		comprimento = 0;
		altura = 0;
	}

	public double getComprimento() {
		return comprimento;
	}

	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Poligono [comprimento=" + comprimento + ", altura=" + altura + "]";
	} 
	
	
	
	

}
