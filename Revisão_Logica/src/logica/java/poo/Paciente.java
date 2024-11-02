package logica.java.poo;

import java.util.Scanner;


/**
 * Crie uma estrutura de menu para os dois algoritmos criados,
 * em que o usuário deve escolher uma opção para calcular o IMC
 * e outra para calcular o metabolismo. Também deve haver uma
 * opção para o escape do programa.
 */
public class Paciente {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		while (opcao != 4) {  // Condição para continuar no menu
			String genero;
			float peso;
			float altura;
			int idade;

            System.out.printf(" MENU:%n%n");
            System.out.printf(" OPÇÃO 1:%n Calcular IMC do paciente.%n%n");
            System.out.printf(" OPÇÃO 2:%n Calcular metabolismo basal do paciente.%n%n");
            System.out.printf(" OPÇÃO 3:%n Verificar se um número é PAR ou ÍMPAR.%n%n");
            System.out.printf(" OPÇÃO 4:%n Sair do sistema.%n%n");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println(" Insira seus dados para calcular seu IMC:\n\n");

                    System.out.println(" Insira seu peso:\n");
                    peso = entrada.nextFloat();
                    System.out.printf(" Você está pesando: %.1fKg%n%n", peso);

                    System.out.println(" Insira sua altura:\n");
                    altura = entrada.nextFloat();
                    System.out.printf(" Sua altura é: %.2fcm", altura);

                    float imc = calcularIMC(peso, altura);
                    System.out.printf(" Seu IMC é: %.2f\n", imc);
                    break;

                case 2:
                    System.out.println(" Insira seus dados para calcular seu metabolismo basal:\n\n");

                    entrada.nextLine(); // Consome a quebra de linha pendente

                    System.out.println(" Insira seu genero:\n");
                    genero = entrada.nextLine().trim();
                    System.out.printf(" Genero: %s%n%n", genero);

                    System.out.println(" Insira seu peso:\n");
                    peso = entrada.nextFloat();
                    System.out.printf(" Você está pesando: %.1fKg%n%n", peso);

                    System.out.println(" Insira sua altura:\n");
                    altura = entrada.nextFloat();
                    System.out.printf(" Sua altura é: %.2fcm%n", altura);

                    System.out.println(" Insira sua idade:\n");
                    idade = entrada.nextInt();
                    System.out.printf(" Você tem %d anos%n%n", idade);

                    float metabolismo2 = metabolismo(peso, altura, idade, genero);
                    System.out.printf(" Seu metabolismo está a %.2f.%n%n", metabolismo2);
                    break;
                    
                case 3:
                	System.out.println("\n Insira número para ver se é par ou impar.");
                	int numero = entrada.nextInt();
                	System.out.printf("\n Número inserido foi %d%n%n", numero);
                	
                	if ((numero % 2) == 0) {
						System.out.printf("%n %d é umnúmero par.", numero);
					} else {
						System.out.printf("%n %d é um número impar.", numero);
					}
                	
                	
                case 4:
                    System.out.println("\n Saída do sistema.");
                    break;

                default:
                    System.out.println(" OPÇÃO INDEFERIDA INFELIZMENTE.\n");
            }
        }
    }
	

		public static float calcularIMC(float peso, float altura) {
			float metabolismo = peso / (float)Math.pow(altura, 2);
			return metabolismo;
		}
		
		/*
		 * O método equalsIgnoreCase(), ele ignora letras maiúsculas de minúsculas
		 * garantindo por exemplo que as palavras como "Masculino" ou "masculino"
		 * e "Feminino" ou "feminino" sejam aceitos.
		 * O método ele retorna true se a String dentro da comparação,
		 * e false se a String for diferente.
		 */
		public static float metabolismo(float peso, float altura, int idade, String genero) {					
			double metabolismoBasal;
			
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
			return idade;
		}
}
