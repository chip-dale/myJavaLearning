/**
 * ������� ������ �� 20 ��������� ����� � ��������� �� -10 �� 30. 
 * �������� ���������, ������������ ����� ��������� �������, 
 * ����������� � ������� ����� ������� �������������� �������� 
 * (������ ������������� ������� �� ������ ������� � �����). 
 * ������� �� ������� ���������� ������ � �����.
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
