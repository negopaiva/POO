package CalculoArea;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<AreaCalculavel> Lista= new ArrayList<AreaCalculavel>();
		
		Quadrado q = new Quadrado(15);
		Retangulo r= new Retangulo(15, 20); 
		Raio circulo = new Raio(50); 
		
		Lista.add(circulo); 
		Lista.add(r); 
		Lista.add(q); 
		
		for(AreaCalculavel a: Lista) {
			System.out.println(a); 
		}

	}

}
