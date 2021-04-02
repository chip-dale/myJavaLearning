import java.util.ArrayList;
import java.util.Scanner;

public class TaskVariant2 {
    public static void main(String[] args) throws NotFoundException {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> endless = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            endless.add((int)(Math.random() * 100));
        }

        System.out.print("ARRAY: [");
        for(Integer i : endless) {
            System.out.print(i + ", ");
        }
        System.out.println("\b\b]");
        System.out.println("ARRAY SIZE: " + endless.size());

        int n;
        while(true) {
            System.out.print("ENTER ARRAY INDEX: ");
            n = sc.nextInt();
            if(n >= endless.size()) {
                throw new NotFoundException("индекс пустой или его не существует");
            } else {
                System.out.println("\tARRAY ELEMENT: " + endless.get(n));
            }
        }
    }
}
