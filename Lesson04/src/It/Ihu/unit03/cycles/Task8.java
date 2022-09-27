
package It.Ihu.unit03.cycles;

import java.util.Scanner;

//8. Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task8 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Введите число");
		
		int x = in.nextInt();
		int c = 5;
		int y = 0;
		int a = 0;
		int b = 11;
		int h = 2;
		
		if (x == 15) {
			for (int i = a; i<=b;i+=h) {
				y = (x+c)*2;
			}
		}else {
			for (int j = a; j<=b;j+=h) {
				y = (x-c)+6;
			}
		}
		
		System.out.print(y);
		
	}
}
