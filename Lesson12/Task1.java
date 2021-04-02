import java.util.Scanner;

/**
 * <pre>Создать класс Queue</pre>
 *
 * <p>{Queue} -- в переводе с англ. ОЧЕРЕДЬ</p>
 * <p>Очередь — такой же вспомогательный инструмент программиста, как и стек.
 * Они используются для моделирования реальных ситуаций ожидания клиентов в банке,
 * вылета самолетов или передачи данных по Интернету.</p>
 */
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ENTER NUM:\t");
        int n = sc.nextInt();

        Queue q = new Queue(n);
        Queue s = new Queue(n);

        for (int i = 0; i < n; i++) {
            q.push(i);
            s.push(i);
        }

        System.out.print("\ncontents of QUEUE >> FiFo (First-in First-out):\n\t");
        for (int i = 0; i < n; i++) {
            System.out.print(q.pop(i) + " ");
        }
        System.out.print("\ncontents of STACK >> FiLo (First-in Last-out):\n\t");
        for (int i = 0; i < n; i++) {
            System.out.print(s.pop() + " ");
        }

        System.out.println();
    }
}
