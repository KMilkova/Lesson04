package It.Ihu.unit03.branching;

//17. Даны целые числа n, m. Если числа не равны, то заменить каждое из них одним и тем же числом, равным большему
//из исходных, а если равны, то заменить числа нулями.

public class Task17 {
	public static void main(String[] args) {
		int m = 4;
		int n = 4;
		System.out.println("n = "+n+ "; m = "+m);

		if (n<m) {
			n = m;
		}else if (m<n) {
			m = n;
		}else {
			n = m = 0;
		}
		
		System.out.print("x = "+n+ "; y = "+m);

	}
}
