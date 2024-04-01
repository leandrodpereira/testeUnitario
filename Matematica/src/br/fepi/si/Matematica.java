package br.fepi.si;

public class Matematica {
	
	/**
	 * Método que retorna o maior valor.
	 * @param n1
	 * @param n2
	 * @return Maior valor entre n1 e n2.
	 * @author Leandro Duarte
	 * @since 25/03/2024
	 */
	public Double maior (Double n1, Double n2) {
		if (n1 > n2) {
			return n1;
		}else {
			return n2;
		}
	}
	
	/**
	 * @param n1
	 * @return true para valores positivos.
	 */
	public boolean isPositivo (Double n1) {
		if (n1 > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return soma entre n1 e n2.
	 */
	public Double soma (Double n1, Double n2) {
		return (n1 + n2);
	}
	
	/**
	 * @param n1
	 * @param n2
	 * @return divisão de n1 por n2.
	 */
	public Double divisao (Double n1, Double n2) {
		return (n1 / n2);
	}
	
	/**
	 * @param n
	 * @return se n é par ou impar.
	 */
	public String parImpar (int n) {
		return n % 2 == 0 ? "Par": "Impar";
	}
}
