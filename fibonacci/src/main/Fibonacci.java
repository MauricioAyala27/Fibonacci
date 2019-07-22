package main;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de numero que desea generar");
		int n = Integer.parseInt(sc.nextLine());
		 
		for (int i = 1; i <= n; i++) {
			
			System.out.println(i + ": " + generarNumero(i+1));
		}
		
	}
	
	public static long generarNumero(int n) {
		if (n <= 1) {
		
			return n;
		}
		else {
			return generarNumero(n-1) + generarNumero(n-2);
		}
	}

}
