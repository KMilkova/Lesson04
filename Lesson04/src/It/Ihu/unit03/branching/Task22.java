package It.Ihu.unit03.branching;

import java.util.Scanner;

//22. Перераспределить значения переменных х и у так, чтобы в х оказалось большее из этих значений, а в y - меньшее.

public class Task22 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Введите числа");
		int x = in.nextInt();
		int y = in.nextInt();
		System.out.println("x = "+x+ "; y = "+y);

		int t = 0;
		if (x<y) {
			t = x;
			x = y;
			y = t;
		}
		
		System.out.print("x = "+x+ "; y = "+y);

	}
}
