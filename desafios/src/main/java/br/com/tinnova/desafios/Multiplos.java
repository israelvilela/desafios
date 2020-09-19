package br.com.tinnova.desafios;

public class Multiplos {

	public static int calcularMultiplos(int num) {
		int total = 0;
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				total += i;
			} else if (i % 5 == 0) {
				total += i;
			}
		}
		
		return total;
	}
}
