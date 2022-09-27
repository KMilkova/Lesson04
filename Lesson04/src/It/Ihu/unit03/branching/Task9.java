package It.Ihu.unit03.branching;

import java.util.Scanner;

//9. Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник
//равносторонним.

public class Task9 {
	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите числа");
		a = in.nextInt();
		b = in.nextInt();
		c = in.nextInt();
		
		if (a==c && a==b) {
			System.out.print("Треугольник равносторонний");
		}else {
			System.out.print("Треугольник не равносторонний");
		}

		
	}
}
