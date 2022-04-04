import java.util.Scanner;

public class Calorias {
	public static void main(String[] args) {
		// NOME: Gabriel Vitor Grossi Lourenço
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o mínimo de calorias (Q1):");
		int Q1 = ler.nextInt();
		
		System.out.println("Digite o máximo de calorias (Q2):");
		int Q2 = ler.nextInt();
		
		System.out.println("Número de calorias caso a diferença seja maior que X (Q3):");
		int Q3 = ler.nextInt();
		
		System.out.println("Número de calorias (X):");
		int X = ler.nextInt();
		
		if (Q2 - Q1 <= X) {
			System.out.println("O número de calorias no seu prato é: "+ Q2);
		}
		else {
			System.out.println("O número de calorias no seu prato é: "+ Q3);
		}
	}
}
