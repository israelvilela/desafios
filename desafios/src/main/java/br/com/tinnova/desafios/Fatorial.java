package br.com.tinnova.desafios;

public class Fatorial {

	public int fatorial(int numero) {
	    if (numero == 0) {
	    	return 1;
	    }
	        
	    return numero * fatorial(numero - 1);
	  }
}
