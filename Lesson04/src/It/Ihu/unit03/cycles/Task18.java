package It.Ihu.unit03.cycles;

//18. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или
//равен заданному е. Общий член ряда имеет вид:


public class Task18 {
	public static void main(String[] args) {
		double a = 0.0;
		double e = 0.15;
		double sum = 0.0;
		int n = 20;
		
		for (int i = 2; i<=n;i++) {
			a = Math.pow(-1, i-1)/i;
			if (Math.abs(a) >=e) {
				sum+=a;
			}
		}
		System.out.print(sum);
	}
}
