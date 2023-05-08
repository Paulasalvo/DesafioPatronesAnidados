package cl.desafiolatam;

import java.util.Scanner;

public class PatronesAnidados {

	public static void main(String[] args) {
		
			System.out.print("Ingrese un número");
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			cuadrado(n);
			System.out.printf("\n");
			zeta(n);
			System.out.printf("\n");
			formaX(n);
			System.out.printf("\n");
			formaGusano(n);
			System.out.printf("\n");
			sc.close();
				
	}
	
	public static void cuadrado(int n) {
			//cuadrado
			for (int i=1; i<= n; i++) {		
				for( int j=0;j < n;j++) {
					if (i == n || i == 1) {	
						System.out.printf("x");
					}
					else {
						if (j == 0 || j == n-1) {
							System.out.print("x");
						}
						else {
							System.out.print(' ');
						}
					}
					
				}
			System.out.printf("\n");
			}
	}		
	
			
			// z		
	public static void zeta(int n) {
			for (int i=1; i<= n; i++) {		 
				for( int j=0;j < n;j++) {	
					if (i == n || i == 1) {	
						System.out.printf("x");
					}		
					else {
						if ( j == n- i) {
							System.out.print("x");
						}
						else {
							System.out.print(' ');
						}
					}
				}
				System.out.printf("\n");	
			}
			
	}
			
// x
	public static void formaX(int n) {
			for (int i=0; i< n; i++) {		
				for( int j=0;j < n;j++) {
					if (i == n-1 || i == 0) { 
						if (j==0 || j == n-1) {
							System.out.printf("x");
						}
						else {
							System.out.print(' ');
						}
					}		
				else {
						if ( j == (n-1)- i || j == i) {
							System.out.print("x");
						}	
						else {
							System.out.print(' ');
						}
				}
				}
				System.out.printf("\n");	
			}
	}		
			
			
			
//gusano
	public static void formaGusano(int n) {
			for (int i=0; i< n; i++) {		
				for( int j=0;j < n;j++) {
					if (i == 0) { 
						if (j < n-1) {
							System.out.printf("x");
						}
						else {
							System.out.print(' ');
						}	
					}		
					else if (i == n-1) {
						if (j > 0) {
							System.out.printf("x");
						}
						else {
							System.out.print(' ');
						}
						}						

					else {
						if ( j != 0 && j != n-1) {
							System.out.print("x");
						}
						else {
							System.out.print(' ');
						}
					}
			}
			System.out.printf("\n");	
		}
	}
}
	
	


	


