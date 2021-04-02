import java.util.Scanner;
    /* Исмаилова Фидан */
public class Lesson4Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //вариант1
        System.out.println(" >> STRING >> next() >> ");
        String s1, s2, s3, s4, s5;
        System.out.println("Please enter Variable Name 1 >> ");
        s1 = sc.next(); // TODO: next() >> если вводить переменную через пробел, то всё, что после пробела - след.переменная
        System.out.println("Please enter Variable Name 2 >> ");
        s2 = sc.next(); // TODO: если начать ввод с кавычек >> похоже, что первый символ после принимает за CHAR ???
        System.out.println("Please enter Variable Name 3 >> ");
        s3 = sc.next();
        System.out.println("Please enter Variable Name 4 >> ");
        s4 = sc.next();
        System.out.println("Please enter Variable Name 5 >> ");
        s5 = sc.next();
        String[] arr = {s1, s2, s3, s4, s5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + arr[0] + ";\n\t" + arr[1] + ";\n\t" + arr[2] + ";\n\t" + arr[3] + ";\n\t" + arr[4] + ".");
        //вариант2
        System.out.println(" >> STRING >> nextLine() >> ");
        String sL1, sL2, sL3, sL4, sL5;
        System.out.println("Please enter Variable Name 1 (Line) >> ");
        sL1 = sc.nextLine();    // TODO: ??ввод первой строки пропадает :-(
        System.out.println("Please enter Variable Name 2 (Line) >> ");
        sL2 = sc.nextLine();
        System.out.println("Please enter Variable Name 3 (Line) >> ");
        sL3 = sc.nextLine();
        System.out.println("Please enter Variable Name 4 (Line) >> ");
        sL4 = sc.nextLine();
        System.out.println("Please enter Variable Name 5 (Line) >> ");
        sL5 = sc.nextLine();
        String[] arrL = {sL1, sL2, sL3, sL4, sL5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + arrL[0] + ";\n\t" + arrL[1] + ";\n\t" + arrL[2] + ";\n\t" + arrL[3] + ";\n\t" + arrL[4] + ".");
        //вариант3
        System.out.println(" >> INT >> ");
        int i1, i2, i3, i4, i5;
        System.out.println("Please enter Variable Num 1 >> ");
        i1 = sc.nextInt();
        System.out.println("Please enter Variable Num 2 >> ");
        i2 = sc.nextInt();
        System.out.println("Please enter Variable Num 3 >> ");
        i3 = sc.nextInt();
        System.out.println("Please enter Variable Num 4 >> ");
        i4 = sc.nextInt();
        System.out.println("Please enter Variable Num 5 >> ");
        i5 = sc.nextInt();
        int[] num = {i1, i2, i3, i4, i5};
        System.out.println("Thanks!\nYour ARRAY is:\n\t" + num[0] + ";\n\t" + num[1] + ";\n\t" + num[2] + ";\n\t" + num[3] + ";\n\t" + num[4] + ".");
    }
}
