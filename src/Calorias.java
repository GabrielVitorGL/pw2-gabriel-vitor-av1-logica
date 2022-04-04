
public class Calorias {
	public static void main(String[] args) {
		int Q1, Q2, Q3, X;
		
		Q1 = 1500;
		Q2 = 2000;
		Q3 = 2500;
		X = 1000;
		
		if (Q2 - Q1 <= X) {
			System.out.println("O número de calorias no seu prato é: "+ Q2);
		}
		else {
			System.out.println("O número de calorias no seu prato é: "+ Q3);
		}
	}
}
