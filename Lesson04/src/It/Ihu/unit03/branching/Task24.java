package It.Ihu.unit03.branching;

import java.util.Scanner;

//24. Составить программу, определяющую результат гадания на ромашке — «любит—не любит», взяв за исходное
//данное количество лепестков п.

public class Task24 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");
		int n = in.nextInt();
		
		if (n % 2 != 0) {
			System.out.println("Любит");
		}else {
			System.out.println("Не любит");
		}
	
	}
}
