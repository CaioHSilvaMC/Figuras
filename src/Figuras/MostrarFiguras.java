package Figuras;

import java.util.Scanner;

public class MostrarFiguras {
	
	public static void main(String[] args) {
		
		Calculos qua = new Quadrado (4);
		Calculos tri = new Triangulo (5,4,3);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Qual figura deseja formar?");
		System.out.println("1- Triangulo");
		System.out.println("2- Quadrado");
		int escolha = scanner.nextInt();
		
		switch (escolha) {
		case 1: 
			System.out.println("Área: " + tri.areaCalcular());
			System.out.println("Perímetro: " + tri.perCalcular());
			break;
			
			case 2:
				System.out.println("Área: " + qua.areaCalcular());
				System.out.println("Perímetro: " + qua.perCalcular());
			break;
		
			default:
				throw new IllegalArgumentException("Inválido ");
		}		
		
		scanner.close();
	}
}
