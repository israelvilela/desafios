package br.com.tinnova.desafios;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafiosApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafiosApplication.class, args);
//		votosEleitores();
//		bubbleSort();
//		fatorial(5);
//		multiplos(12);
	}
	
	public static void votosEleitores() {
		Voto voto = new Voto();
		voto.setBrancos(new BigDecimal(150));
		voto.setNulos(new BigDecimal(50));
		voto.setValidos(new BigDecimal(800));
		
		BigDecimal brancos = voto.percentualBrancos(new BigDecimal(1000));
		BigDecimal validos = voto.percentualValidos(new BigDecimal(1000));
		BigDecimal nulos = voto.percentualNulos(new BigDecimal(1000));

		
		System.out.println("Total de votos brancos é:" + brancos.intValue() + "%");
		System.out.println("Total de votos validos é:" + validos.intValue() + "%");
		System.out.println("Total de votos nulos é:" + nulos.intValue() + "%");

	}
	
	public static void bubbleSort() {
		BubbleSort ob = new BubbleSort();
		
        int arr[] = {5, 3, 2, 4, 7, 1,	0, 6};
        
        ob.bubbleSort(arr);
        ob.arrayOrdenado(arr);
	}
	
	public static void fatorial(int numero) {
		Fatorial r = new Fatorial();
	    int resp = r.fatorial(numero);
	    
	    System.out.println(resp);
	}
	
	public static void multiplos(int numero) {
		int total = Multiplos.calcularMultiplos(numero);

		System.out.println(total);
	}
}
