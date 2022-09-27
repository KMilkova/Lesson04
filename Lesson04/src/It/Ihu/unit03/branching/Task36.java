package It.Ihu.unit03.branching;

//36. Вычислить значение функции:

import java.util.Scanner;

public class Task36 {
	public static void main(String[] args) {		
		double fx = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Введите число");

		int x = in.nextInt();
		
		if (x<=3) {
			fx = Math.pow(x, 2)-3*x+9;
		}
		else {
			if ((Math.pow(x,3)+6)!=0) {
				fx = 1/(Math.pow(x,3)+6);		
			}
		}
		
		System.out.print(fx);
		
	}

}
