package br.com.tinnova.desafios;

import java.math.BigDecimal;

public interface CalculoVotos {

	BigDecimal percentualValidos(BigDecimal totalVotos);
	BigDecimal percentualBrancos(BigDecimal totalVotos);
	BigDecimal percentualNulos(BigDecimal totalVotos);
}
