package It.Ihu.unit03.cycles;

import java.util.Scanner;

//6. Напишите программу, где пользователь вводит любое целое положительное число. А программа
//суммирует все числа от 1 до введенного пользователем числа.

public class Task6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число");
		
		int x = in.nextInt();
		int sum = 0;
		
		if (x>0) {
			for (int i = 1; i<=x;i++) {
				sum+=i;
			}
		}
		System.out.print(sum);

	}
}
