package It.Ihu.unit03.branching;

//19. Подсчитать количество положительных среди чисел а, b, с.

public class Task19 {
	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		int c = -9;
		int cnt = 0;
		
		if (a > 0) {
			cnt++;
		}
		if (b>0) {
			cnt++;
		}
		if (c>0) {
			cnt++;
		}
		
		System.out.print(cnt);
	}
}
