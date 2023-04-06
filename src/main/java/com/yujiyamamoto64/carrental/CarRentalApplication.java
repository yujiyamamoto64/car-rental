package com.yujiyamamoto64.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yujiyamamoto64.carrental.exercises.BubbleSort;
import com.yujiyamamoto64.carrental.exercises.Fatorial;
import com.yujiyamamoto64.carrental.exercises.SomaMultiplos35;
import com.yujiyamamoto64.carrental.exercises.Votos;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);

		System.out.println("Exercicio 1: Votos em relacao ao total de eleitores:");
		System.out.println("1000 eleitores, 800 votos validos, 150 brancos e 50 nulos");
		System.out.println("O percentual de votos validos em relacao ao total de eleitores:");
		System.out.println((Votos.votosValidos(1000.0, 800.0) * 100) + " %");
		System.out.println("O percentual de votos brancos em relacao ao total de eleitores:");
		System.out.println((Votos.votosBrancos(1000.0, 150.0) * 100) + " %");
		System.out.println("O percentual de votos nulos em relacao ao total de eleitores:");
		System.out.println((Votos.votosNulos(1000.0, 50.0) * 100) + " %");
		System.out.println("~~~~~Fim da primeira atividade~~~~~~");

		System.out.println("Exercicio 2: Bubble sort; Ordene o vetor: 5, 3, 2, 4, 7, 1, 0, 6");
		int arr[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		BubbleSort.bubbleSort(arr);
		System.out.print("R: ");
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("~~~~~Fim da segunda atividade~~~~~~");

		System.out.println("Exercicio 3: Fatorial; Qual o valor do fatorial 5!");
		System.out.println("R: " + Fatorial.calculoFatorial(5));
		System.out.println("~~~~~Fim da terceira atividade~~~~~~");

		System.out.println("Exercicio 4: Some dos Multiplos de 3 e 5; Valor 10");
		System.out.println("R: " + SomaMultiplos35.calculoSomaMultiplosDe3e5(10));
		System.out.println("~~~~~Fim da quarta atividade~~~~~~");

	}

}
