package It.Ihu.unit03.cycles;

//17. Даны действительное (а) и натуральное (n). вычислить: a(a+1)...(a+n-1)

public class Task17 {
	public static void main(String[] args) {
		double a = 1;
		int n = 5;
		double result = 1;
		
		for (int i = 0; i<n;i++) {
			result *= a+i;
		}
		System.out.print(result);
	}
}
