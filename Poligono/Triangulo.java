package Poligono;

public class Triangulo extends Poligono {
	
	public Triangulo(double comprimento, double altura) {
		super(comprimento, altura);
		// TODO Auto-generated constructor stub
	}
	
	public Triangulo() {
		
	}
		
	public double area(double comprimento, double altura) {
		double t = (comprimento*altura)/2; 
		return t; 
	}
	

}
