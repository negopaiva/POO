package CalculoArea;

public class Raio implements AreaCalculavel {
	
	private double raio;
	
	public Raio() {
		this.raio = 0.0; 
	}

	public Raio(double raio) {
		super();
		this.raio = raio;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (3.14159 * Math.pow(raio, 2));
	}

	@Override
	public String toString() {
		return "Ciruclo: Area\t" + calculaArea() + "\n";
	}
	
	

}
