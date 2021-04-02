/**
 * —оздать массив из 200 случайных чисел в диапазоне от 0 до 200. 
 * ќпределить количество одноразр€дных, двухразр€дных и трЄхразр€дных чисел в процентном отношении. 
 * ¬ывести на консоль полученный массив и количество по разр€дам.
 */
public class Task1 {

	public static void main(String[] args) {
		int[] arr = new int[200];
		
		System.out.print("ARRAY:");
		for(int i = 0; i < 200; i++) {
			arr[i] = (int)(Math.random() * 201);
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		
		System.out.print("\nONE-DIGIT NUMs:");
		int one = 0;
		for(int i = 0; i < 200; i++) {
			if(String.valueOf(arr[i]).length() == 1) {
				System.out.print(" " + arr[i]);
				one += String.valueOf(arr[i]).length();
			}
		}
		System.out.println("\n\tCOUNT: " + one + " or " + (double)one/2 + "%");
		
		System.out.print("\nTWO-DIGIT NUMs:");
		int two = 0;
		for(int i = 0; i < 200; i++) {
			if(String.valueOf(arr[i]).length() == 2) {
				System.out.print(" " + arr[i]);
				two += String.valueOf(arr[i]).length();
			}
		}
		System.out.println("\n\tCOUNT: " + two/2 + " or " + (double)two/4 + "%");
		
		System.out.print("\nTHREE-DIGIT NUMs:");
		int three = 0;
		for(int i = 0; i < 200; i++) {
			if(String.valueOf(arr[i]).length() == 3) {
				System.out.print(" " + arr[i]);
				three += String.valueOf(arr[i]).length();
			}
		}
		System.out.println("\n\tCOUNT: " + three/3 + " or " + (double)three/6 + "%");

	}

}
