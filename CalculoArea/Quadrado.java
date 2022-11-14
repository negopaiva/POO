package CalculoArea;

public class Quadrado implements AreaCalculavel {
	
	private double lado; 
	
	
	public Quadrado() {
		this.lado = 0.0; 
	}

	public Quadrado(double lado) {
		super();
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		
		// TODO Auto-generated method stub
		return ( lado*4);
	}

	@Override
	public String toString() {
		return "Quadrado:  Area\t" + calculaArea() + "\n";
	}
	
	

}
