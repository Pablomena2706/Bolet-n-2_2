package Bucles;

import java.util.Random;

public class Exercise2 {

	public static void main(String[] args) {
		boolean exit = false;
		int number, i = 1;
		Random random = new Random();

		do {
			number = random.nextInt(1000) + 1;
			System.out.println(number);
			exit = (number % 9 == 0);
			i++;
		} while (!exit && i <= 5);
		if (!exit) {
			System.out.println("No se encontró el múltiplo de 9");
		}
	}

}
