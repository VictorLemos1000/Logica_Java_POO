package logica.java.poo;

import java.util.Scanner;

/**
 * Exercício (Calcular o IMC – Parte 1):
 * Solicite ao usuário a entrada do nome;
 * Solicite ao usuário a entrada do peso do mesmo em Kg;
 * Solicite ao usuário a entrada da altura do mesmo em metros;
 * Informe a saída exibindo o IMC.
 * FORMÚLA: imc = peso / altura²
 * Modifique o programa para que a saída obedeça a seguinte condição:
 */
public class CalcularIMC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Digite seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("\n Digite seu peso: ");
		double peso = input.nextDouble();
		
		System.out.println("\n Digite sua altura: ");
		double altura = input.nextDouble();
		
		// Indíce de massa corporal
		double imc = peso / Math.pow(altura, altura);
		
		if (imc < 19.0) {
			System.out.println("\n O paciente está com \"baixo peso\".");
			System.out.printf(" IMC: %.2f", imc);
		} else if ((19.0 <= imc) && (imc < 25.0)) {
			System.out.println("\n O peso do paciente está \"normal\".");
			System.out.printf(" IMC: %.2f", imc);
		} else if ((25.0 <= imc) && (imc < 30.0)) {
			System.out.println("\n O paciente está no \"sobrepeso\".");
			System.out.printf(" IMC: %.2f", imc);
		} else if ((30.0 <= imc) && (imc < 40.0)) {
			System.out.println("\n O paciente tem \"obesidade do tipo1\".");
			System.out.printf(" IMC: %.2f", imc);
		} else if (imc >= 40.0) {
			System.out.println("\n O paciente tem \"obesidade morbida\".");
			System.out.printf(" IMC: %.2f", imc);
		} else {
			System.out.println("\n Paciente não requisitou nenhum dado.");
		}
	}
}
