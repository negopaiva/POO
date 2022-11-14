package Conta;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Conta> lista=new ArrayList<Conta>();
		
		ContaCorrente cc=new ContaCorrente(123,321);
		
		ContaPoupanca cp=new ContaPoupanca(123,321);
		
		//cc.getTipo();
		//System.out.println();
		//cp.getTipo();
		
		lista.add(cc);
		lista.add(cp);
		
		for(Conta c:lista) {
			c.getTipo();
		}
		
		ArrayList<Tributavel> lista2= new ArrayList<Tributavel>();
		
		lista2.add(cc);
		lista2.add(new SeguroVida());
		System.out.println("\n");
		for(Tributavel t:lista2) {
			t.verTaxas();
		}
		
	}

}
