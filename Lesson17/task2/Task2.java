package task2;

/**
 * Разработать набор классов (используя наследование) для решения задачи
 * подсчета заработной платы сотрудников некоторой фирмы.
 * На фирме есть несколько способов оплаты труда:
 * ■ ставка – указывается, сколько сотрудник получает за рабочий день;
 * для каждого сотрудника записывается, сколько дней он отработал в месяце;
 * ■ почасовая – указывается, сколько сотрудник получает в час, для каждого сотрудника;
 * записывается, сколько часов он отработал в месяце;
 * ■ сдельная – указывается, сколько сотрудник получит за выполненную работу;
 * для каждого сотрудника записываются суммы для каждой работы, что он успел сделать за месяц.
 * Программа должна уметь выводить отчет по всем сотрудникам фирмы о заработной плате в виде:
 * ФИО Вид оплаты Сумма
 * Иванов ставка 3000 грн
 * Сидоров почасовая 800 грн
 * Петров сдельная 5500 грн
 * Итого 9300 грн
 */
public class Task2 {
	public static void main(String[] args) {
		Table t = new Table(53);
		
		Worker[] employee = {
			new DayPerMonth("Иванов", 10, 25),
			new HourPerMonth("Петров", 5, 160),
			new JobPerMonth("Сидоров", 10, 25, 10, 25),
			new DayPerMonth("Иван Иванов", 10, 25),
			new HourPerMonth("Иван Петров", 5, 160),
			new JobPerMonth("Иван Сидоров", 10, 20, 0, 25),
			new DayPerMonth("С.Петров", 20, 20),
			new HourPerMonth("С.Иванов", 2, 150)
		};

		t.paintLine();
		System.out.printf("| %-15s | %-15s | %-15s |\n", "Ф.И.О.", "ВИД ОПЛАТЫ", "СУММА");
		t.paintLine();
		double sumSalary = 0;
		for (Worker i : employee) {
			System.out.printf("| %15s | %15s | %11.2f грн |\n", i.getName(), i.getTitle(), i.getSalary());
			sumSalary += i.getSalary();
		}
		t.paintLine();
		System.out.printf("| %s %40.2f грн |\n", "ИТОГО:", sumSalary);
		t.paintLine();
	}
}
