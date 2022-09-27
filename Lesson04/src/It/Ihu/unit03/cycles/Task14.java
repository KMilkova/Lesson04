package It.Ihu.unit03.cycles;

//14. Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.

public class Task14 {
	public static void main(String[] args) {
		double n = 4.0;
		double result = 0;
		
		for (double i = 1;i<=n;i++) {
			result +=1/i;
		}
		
		System.out.print(result);
	}
}
