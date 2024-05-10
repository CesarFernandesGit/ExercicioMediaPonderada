import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos casos voce vai digitar? ");
		int caso = scanner.nextInt();
		double numero1 = 0;
		double numero2 = 0;
		double numero3 = 0;
		
		for (int i = 0; i < caso; i++) {
			System.out.println("Digite tres numeros: ");
			numero1 = scanner.nextDouble();
			numero2 = scanner.nextDouble();
			numero3 = scanner.nextDouble();
			
			numero1 = numero1 * 2;
			numero2 = numero2 * 3;
			numero3 = numero3 * 5;
			 
			double media = (numero1 + numero2 + numero3) / 10;
			System.out.printf("MEDIA = %.1f%n", media);
		}
		
		
		scanner.close();
		
	}

}
