package It.Ihu.unit03.cycles;

//9. Найти сумму квадратов первых ста чисел.

public class Task9 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		while (x<=100) {
			sum+=Math.pow(x, 2);
			x++;
		}
		
		System.out.print(sum);
	}
}
