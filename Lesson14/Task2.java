/**
 * Создать массив из 20 случайных чисел в диапазоне от -10 до 30. 
 * Написать программу, определяющую сумму элементов массива, 
 * находящихся в массиве после первого отрицательного элемента 
 * (первый отрицательный элемент не должен входить в сумму). 
 * Вывести на консоль полученный массив и сумму.
 */
public class Task2 {

	public static void main(String[] args) {
		int[] arr = new int[20];
		
		int a = -10;
		int b = 30;
		int sum = 0;
		System.out.print("ARRAY:");
		for(int i = 0; i < 20; i++) {
			arr[i] = (int)(Math.random() * (a-b)) + b;
			sum += arr[i];
			System.out.print(" " + arr[i]);
		}
		System.out.println("\nSUM = " + sum);

	}

}
