import java.util.Scanner;
/**
 * Создать класс калькулятор, имеющий методы 
 * сложения, вычитания, умножения, деления, 
 * возведения в степень двух чисел. 
 * Использовать static.
 */
public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("PLEASE ENTER FIRST NUM: ");
		int a = sc.nextInt();
		System.out.print("PLEASE ENTER SECOND NUM: ");
		int b = sc.nextInt();
		
		Calculator calc = new Calculator();
		System.out.println(a + " + " + b + " = " + calc.sum(a, b));
		System.out.println(a + " - " + b + " = " + calc.diff(a, b));
		System.out.println(a + " * " + b + " = " + calc.mult(a, b));
		System.out.println(a + " / " + b + " = " + calc.div(a, b));
		System.out.println(a + " to power " + b + " equals " + calc.pow(a, b));

	}

}
