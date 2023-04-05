package com.yujiyamamoto64.carrental.exercises;

public class Votos {

	public Double totalEleitores;
	public Double validos;
	public Double brancos;
	public Double nulos;

	public static Double votosValidos(Double totalEleitores, Double validos) {
		return (validos / totalEleitores);
	}

	public static Double votosBrancos(Double totalEleitores, Double brancos) {
		return (brancos / totalEleitores);
	}

	public static Double votosNulos(Double totalEleitores, Double nulos) {
		return (nulos / totalEleitores);
	}

}
