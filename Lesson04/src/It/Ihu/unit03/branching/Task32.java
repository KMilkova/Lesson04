package It.Ihu.unit03.branching;

//8. Составить программу нахождения наименьшего из квадратов двух чисел а и b.

public class Task32 {
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		
		if (Math.pow(a, 2)>Math.pow(b, 2)) {
			System.out.print(" Квадрат "+Math.pow(b, 2)+" числа "+b+" является наименьшим");
		}else {
			System.out.print(" Квадрат "+Math.pow(a, 2)+" числа "+a+" является наименьшим");
		}
		

	}
}
