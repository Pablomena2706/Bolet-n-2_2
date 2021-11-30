package Bucles;

import java.util.Random;

public class Exercise1 {

	public static void main(String[] args) {
		int i;
		Random random = new Random();

		for (i = 1; i <= 20; i++) {
			System.out.printf("Tirada: %d, resultado: %d \n", i, random.nextInt(6) + 1);
		}

	}
}
