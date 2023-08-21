package view;

import controller.SomaFatoriaisController;

public class Principal {

	public static void main(String[] args) {
		
		SomaFatoriaisController sf = new SomaFatoriaisController ();
		
		System.out.println("Soma Fatorial: " + sf.somaFatorial(5));
		
	}

}
