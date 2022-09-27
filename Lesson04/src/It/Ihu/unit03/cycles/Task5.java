package It.Ihu.unit03.cycles;

//5. С помощью оператора while напишите программу определения суммы всех нечетных чисел в
//диапазоне от 1 до 99 включительно.

public class Task5 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		while (x<=99) {
			if (x % 2 !=0) {
				sum+=x;
			}
			x++;
		}
		System.out.print(sum);
	}
}
