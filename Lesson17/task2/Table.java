package task2;

public class Table {
	private int line;
	
	Table(int line){
		this.line = line;
	}
	
	public void paintLine() {
		System.out.print('|');
		for (int i = 0; i < line; i++) {
			System.out.print('-');
		}
		System.out.println('|');
	}
}
