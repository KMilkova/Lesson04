package It.Ihu.unit03.cycles;

//1. Необходимо вывести на экран числа от 1 до 5.
//2. Необходимо вывести на экран числа от 5 до 1.

public class Task1and2 {
	public static void main(String[] args) {
		for (int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		
		System.out.println();

		for (int j = 5; j>=1;j--) {
			System.out.println(j);

		}
	}
}
