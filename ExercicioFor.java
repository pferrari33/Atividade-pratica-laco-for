package lacosrepeticao;
import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		 int pares = 0;
	        int impares = 0;

	        System.out.println("Digite 10 números inteiros:");

	        for (int i = 0; i < 10; i++) {
	            System.out.print("Número " + (i + 1) + ": ");
	            int numero = scanner.nextInt();

	            if (numero % 2 == 0) {
	                pares++;
	            } else {
	                impares++;
	            }
	        }

	        System.out.println("Quantidade de números pares: " + pares);
	        System.out.println("Quantidade de números ímpares: " + impares);
			
			 scanner.close();
	}

}
