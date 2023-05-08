package cl.desafiolatam;
import java.util.Scanner;
public class Patrones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Ingresa un número: ");
		int n = sc.nextInt();
	//* y punto intercalado
		for(int i=0; i<n; i++) {
			if(i%2==0) {
				System.out.printf("*");
			}
			else {
				System.out.printf(".");
			}
		}
		System.out.print("\n");
	//patrón "1234"
		for(int i=0; i<n; i++) {			
			System.out.printf("1234");
		}
		
		System.out.print("\n");
	//patrón ||*
		for(int i=0; i<n; i++) {
			System.out.printf("||*");
		}
					
		sc.close();
		}
		
		
}	
	
