package com.yujiyamamoto64.carrental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.yujiyamamoto64.carrental.exercises.BubbleSort;
import com.yujiyamamoto64.carrental.exercises.Fatorial;
import com.yujiyamamoto64.carrental.exercises.Votos;

@SpringBootApplication
public class CarRentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarRentalApplication.class, args);

		System.out.println("Exercício 1: Votos em relação ao total de eleitores:");
		System.out.println("O percentual de votos válidos em relação ao total de eleitores:");
		System.out.println((Votos.votosValidos(1000.0, 800.0) * 100) + " %");
		System.out.println("O percentual de votos brancos em relação ao total de eleitores:");
		System.out.println((Votos.votosBrancos(1000.0, 150.0) * 100) + " %");
		System.out.println("O percentual de votos nulos em relação ao total de eleitores:");
		System.out.println((Votos.votosNulos(1000.0, 50.0) * 100) + " %");
		System.out.println("~~~~~Fim da primeira atividade~~~~~~");

		System.out.println("Exercicio 2: Bubble sort; Ordene o vetor: 5, 3, 2, 4, 7, 1, 0, 6");
		int arr[] = { 5, 3, 2, 4, 7, 1, 0, 6 };
		BubbleSort.bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i + ", ");
		}
		System.out.println("~~~~~Fim da segunda atividade~~~~~~");

		System.out.println("Exercicio 3: Fatorial; Qual o valor do fatorial 5!");
		System.out.println(Fatorial.calculoFatorial(5));
		System.out.println("~~~~~Fim da terceira atividade~~~~~~");

	}

}
