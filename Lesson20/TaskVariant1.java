import java.util.Scanner;

/**
 * <p>Создать класс <strong>EndlessArray</strong>.</p>
 *
 * <p>Он будет содержать в себе массив (<b><i>private</i></b>).<br>
 *    Размерность его мы даем по умолчанию 10 (не принимая на вход размер массива).<br>
 *    Он будет состоять из методов <b><i>push</i></b>, <b><i>get</i></b>, <b><i>toString</i></b>.</p>
 *
 * <ul>
 *     <li><em>push</em> - принимает на вход значение и записывает его в конец массива.<br>
 *         Если массив заполнен, юзер не должен знать об этом, и мы должны все равно
 *         найти способ сохранить данное значение.</li>
 *     <li><em>get</em> - по индексу элемента возвращает значение.<br>
 *         Если данный индекс пустой или его не существует
 *         возвращаем NotFoundException (создайте его и обрабатывайте в main)</li>
 *     <li><em>toString</em> - выводит на монитор все содержимое массива от начала
 *     до последнего добавленного элемента.</li>
 * </ul>
 */
public class TaskVariant1 {
    public static void main(String[] args) throws NotFoundException {
        Scanner sc = new Scanner(System.in);

        EndlessArray s = new EndlessArray();
        for (int i = 0; i < 15; i++) {
            s.push(1 + (int)(Math.random() * 99));
            //s.push(i);
        }
        System.out.print("ARRAY (for user) = {");
        for (int i = 0; i < 10; i++) {
            System.out.print(s.get(i) + ", ");
        }
        System.out.println("\b\b}");

        int n;
        while(true) {
            System.out.print("ENTER ARRAY INDEX: ");
            n = sc.nextInt();
            if(n >= 10) {
                throw new NotFoundException("индекс пустой или его не существует\n" + s.toString());
            } else {
                System.out.println("\tARRAY ELEMENT: " + s.get(n));
            }
        }
    }
}
