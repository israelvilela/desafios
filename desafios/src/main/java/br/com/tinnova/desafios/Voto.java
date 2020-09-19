package br.com.tinnova.desafios;

import java.math.BigDecimal;

public class Voto implements CalculoVotos {
	private BigDecimal validos;
	
	private BigDecimal brancos;

	private BigDecimal nulos;
	
	public BigDecimal getValidos() {
		return validos;
	}
	public void setValidos(BigDecimal validos) {
		this.validos = validos;
	}
	public BigDecimal getBrancos() {
		return brancos;
	}
	public void setBrancos(BigDecimal brancos) {
		this.brancos = brancos;
	}
	public BigDecimal getNulos() {
		return nulos;
	}
	public void setNulos(BigDecimal nulos) {
		this.nulos = nulos;
	}
	
	@Override
	public BigDecimal percentualValidos(BigDecimal totalVotos) {
		return getValidos().divide(totalVotos).multiply(new BigDecimal(100));
	}
	
	@Override
	public BigDecimal percentualBrancos(BigDecimal totalVotos) {
		return getBrancos().divide(totalVotos).multiply(new BigDecimal(100));
	}
	@Override
	public BigDecimal percentualNulos(BigDecimal totalVotos) {
		return getNulos().divide(totalVotos).multiply(new BigDecimal(100));
	}
}
