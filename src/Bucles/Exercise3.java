package Bucles;

import java.util.Scanner;

public class Exercise3 {
	public static void main(String[] args) {

		int x, y, sum = 0, i;
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Introduce un número: ");
		x = keyboard.nextInt();
		System.out.println("Introduce otro número:");
		y = keyboard.nextInt();

		for (i = 0; i < y; i++) {
			sum = sum + x;
			System.out.println();
		}
		System.out.println("El producto de los dos valores es: " + sum);

	}
}
