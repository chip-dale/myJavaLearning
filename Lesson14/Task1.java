/**
 * �������� ����� Counter.
 * �� ������ ����� ������ ����������, ����������, 
 * ������ �������� �������� � ������ ������.
 * ������������ ������������.
 */
public class Task1 {
	public static void main(String[] args) {
		Counter count = new Counter();
		count.increment();
		count.increment();
		count.increment();
		System.out.println(count.value());
		count.decrement();
		count.decrement();
		System.out.println(count.value());
		count.reset();
		System.out.println(count.value());
	}
}
