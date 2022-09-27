package It.Ihu.unit03.cycles;

import java.util.Scanner;

//7. Вычислить значения функции на отрезке [а,b] c шагом h:


public class Task7 {
	public static void main(String[] args) {
		int a = 0;
		int b = 12;
		int h = 3;
		int y = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");

		int x = in.nextInt();
		
		if(x>2) {
			for (int i = a; i<=b; i+=h) {
				y = x;
			}
		}else {
			for (int i = a; i<=b; i+=h) {
				y = -x;
			}
		}
		
		System.out.print(y);
	}
}
