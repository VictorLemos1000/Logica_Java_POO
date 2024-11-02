package logica.java.poo;

import java.util.Scanner;

/**
 * Exercício (Calcular o Metabolismo Basal – Parte 2):
 * Solicite ao usuário a identificação de gênero;
 * Solicite ao usuário a entrada da idade em anos;
 * Informe a saída exibindo o metabolismo em Kcal.
 */
public class CalcularMetabolismoBasal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Insira seu gênero como \'Masculino\' ou \'Feminino\': ");
		// trim() ele é um método remove espaços em branco.
		// Que neste caso utilizei para que o a condicionais dentro do Método
		// equalsIgnoreCase pudesse realizar sua funcionalidade dentre os gêneros dos pacientes
		String genero = input.nextLine().trim();
		
		System.out.println(" Insira sua idade: ");
		int idade = input.nextInt();
		System.out.printf(" %d anos", idade);
		
		System.out.println("\n Insira seu peso: ");
		double peso = input.nextDouble();
		System.out.printf(" %.2fKcal", peso);
		
		double metabolismoBasal;
				
		/*
		 * O método equalsIgnoreCase(), ele ignora letras maiúsculas de minúsculas
		 * garantindo por exemplo que as palavras como "Masculino" ou "masculino"
		 * e "Feminino" ou "feminino" sejam aceitos.
		 * O método ele retorna true se a String dentro da comparação,
		 * e false se a String for diferente.
		 */
		if (genero.equalsIgnoreCase("Masculino")) {
		System.out.printf("\n Gênero: %s", genero);
			if (!(18 >= idade) && (idade <= 30)) {
				metabolismoBasal = (15.057 * peso) + 679;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else if (!(30 >= idade) && (idade <= 60)) {
				metabolismoBasal = (11.6 * peso) + 879;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else if (idade > 60) {
				metabolismoBasal = (13.5 * peso) + 487;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else {				
				System.out.println("\n Metabolismo do paciente masculino não condizente.");
			}
		} else if (genero.equalsIgnoreCase("Feminino")) {
			System.out.printf("\n Genero: %s", genero);
			if (!(18 >= idade) && (idade <= 30)) {
				metabolismoBasal = (14.7 * peso) + 486.6;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else if (!(30 >= idade) && (idade <= 60)) {
				metabolismoBasal = (8.7 * peso) + 829.0;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else if (idade > 60) {
				metabolismoBasal = (10.5 * peso) + 569.0;
				System.out.printf("\n Resultado do metabolismo: %.2fKcal", metabolismoBasal);
			} else {
				System.out.println("\n Metabolismo do paciente feminino não condizente.");
			}
		} else {
			System.out.println("\n Genero não declarado corretamente.");
		}
	}
}
