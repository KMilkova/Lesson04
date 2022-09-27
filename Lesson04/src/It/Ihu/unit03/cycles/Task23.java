package It.Ihu.unit03.cycles;

//23. Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
//представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
//значения функции:

public class Task23 {
	public static void main(String[] args) {
		double fx = 0.0;
		double a = 0.1;
		double b = 1;
		double h = 0.1;
		
		System.out.println("---------------------------------");
		System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
		System.out.println("---------------------------------");
		
		for (double i = a; i<= b; i+=h) {
			fx = 1.0/Math.tan(i/3.0)+1/2.0*Math.sin(i);
			System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n",i , fx);
		}
	}
}
