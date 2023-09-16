package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		/*
		 * Cálculo de Fatorial: Solicite um número inteiro não negativo e calcule o
		 * fatorial desse número.
		 */

		int numero;
		long fatorial = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para obter o seu numero fatorial : ");

		numero = sc.nextInt();

		for (int i = 1; i < numero; i++) {

			fatorial *= i;
			System.out.println(fatorial);
		}

		sc.close();

	}

}
