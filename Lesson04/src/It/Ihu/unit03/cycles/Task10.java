package It.Ihu.unit03.cycles;

//10. Составить программу нахождения произведения квадратов первых двухсот чисел.

public class Task10 {
	public static void main(String[] args) {
		int pr = 1;
		int x = 1;
		while (x<=200) {
			pr*=Math.pow(x, 2);
			x++;
		}
		System.out.print("Произведение квадратов первых двухсот чисел "+ pr);
	}
}
