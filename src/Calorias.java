import java.util.Scanner;

public class Calorias {
	public static void main(String[] args) {
		// NOME: Gabriel Vitor Grossi Louren�o
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Digite o m�nimo de calorias (Q1):");
		int Q1 = ler.nextInt();
		
		System.out.println("Digite o m�ximo de calorias (Q2):");
		int Q2 = ler.nextInt();
		
		System.out.println("N�mero de calorias caso a diferen�a seja maior que X (Q3):");
		int Q3 = ler.nextInt();
		
		System.out.println("N�mero de calorias (X):");
		int X = ler.nextInt();
		
		if (Q2 - Q1 <= X) {
			System.out.println("O n�mero de calorias no seu prato �: "+ Q2);
		}
		else {
			System.out.println("O n�mero de calorias no seu prato �: "+ Q3);
		}
	}
}
