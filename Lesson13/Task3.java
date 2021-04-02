import java.util.Scanner;
/**
 * Создать класс Money (Деньги) для работы с денежными суммами.
 * Число должно быть представлено двумя полями:
 * ■ типа long – для манат;
 * ■ типа byte – для копеек.
 * Реализовать вывод значения на экран, при этом дробная часть должна быть отделена от целой части запятой.
 * Реализовать сложение, вычитание, деление сумм, деление суммы на дробное число,
 * умножение на дробное число и операции сравнения.
 */
public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("PLEASE ENTER NUM:");
        System.out.print("\tmanat:\t");
        long manat = sc.nextLong();
        System.out.print("\tqepik:\t");
        byte qepik = sc.nextByte();

        Money wallet = new Money(manat,qepik);

        System.out.println("ЗАДАЧУ РЕШИТЬ НЕ МОГУ");
        System.out.println("ДАННЫЙ КОД <class Money> ИЗ ИНТЕРНЕТА");
        System.out.println("ПРИМЕНИТЬ НА ДЕЛЕ НЕ ПОЛУЧАЕТСЯ");

        System.out.println(manat + "," + qepik);
    }
}

class Money{
    private long manat;
    private byte qepik;

    public Money(long manat, byte qepik) {
        this.manat = manat;
        this.qepik = qepik;
    }

    public static double division(Money operand1, Money operand2) {
        long operand1Total = operand1.getManat() * 100 + operand1.getQepik();
        long operand2Total = operand2.getManat() * 100 + operand2.getQepik();
        return operand1Total / (double) operand2Total;
    }

    public static Money add(Money operand1, Money operand2) {
        long manat = operand1.getManat() + operand2.getManat();
        int qepik = operand1.getQepik() + operand2.getQepik();
        if(qepik > 99){
            manat++;
            qepik -= 100;
        }
        if(qepik < 0){
            manat--;
            qepik += 100;
        }
        return new Money(manat, (byte) qepik);
    }

    public static Money subtruct(Money operand1, Money operand2){
        return add(operand1, new Money(-operand2.getManat(), (byte) -operand2.getQepik()));
    }

    public static Money division(Money operand, double by){
        long operandTotal = (long) ((operand.getManat() * 100 + operand.getQepik()) / by);
        return new Money(operandTotal / 100, (byte) ( operandTotal % 100 ));
    }

    public static Money mult(Money operand, double times){
        return division(operand, 1 / times);
    }

    public long getManat() {
        return manat;
    }

    public byte getQepik() {
        return qepik;
    }

    public String toString(){
        return manat + "," + qepik;
    }

    public boolean equals(Money test){
        return test.getManat() == manat && test.getQepik() == qepik;
    }
}
