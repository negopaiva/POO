package CalculoArea;

public class Retangulo implements AreaCalculavel {
	
	private double base;
	private double altura;
	
	public Retangulo() {
		this.altura = 0.0; 
		this.base = 0.0; 
	}

	public Retangulo(double base, double altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (base*altura);
	}

	@Override
	public String toString() {
		return "Retangulo:  Area\t" + calculaArea() + " \n";
	}

	
}
