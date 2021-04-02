package task1;

import java.io.IOException;
import java.util.Scanner;

public enum Season {
    WINTER(12,1,2),
    SPRING(3,4,5),
    SUMMER(6,7,8),
    AUTUMN(9,10,11);

    private int firstMonth;
    private int secondMonth;
    private int thirdMonth;

    Season(){}
    Season(int firstMonth, int secondMonth, int thirdMonth) {
        this.firstMonth = firstMonth;
        this.secondMonth = secondMonth;
        this.thirdMonth = thirdMonth;
    }

    public int getFirstMonth() { return firstMonth; }
    public int getSecondMonth() {
        return secondMonth;
    }
    public int getThirdMonth() {
        return thirdMonth;
    }

    public String getAllMonth() {
        return name() + " (" + firstMonth + ", " + secondMonth + ", " + thirdMonth + ")";
    }

    public static void checkMonth(String num) {
        Scanner sc = new Scanner(System.in);
        switch (num) {
            case "1" -> {
                System.out.println(WINTER.getSecondMonth() + " >> January >> " + WINTER.getAllMonth());
            }
            case "2" -> {
                System.out.println(WINTER.getThirdMonth() + " >> February >> " + WINTER.getAllMonth());
            }
            case "3" -> {
                System.out.println(SPRING.getFirstMonth() + " >> March >> " + SPRING.getAllMonth());
            }
            case "4" -> {
                System.out.println(SPRING.getSecondMonth() + " >> April >> " + SPRING.getAllMonth());
            }
            case "5" -> {
                System.out.println(SPRING.getThirdMonth() + " >> May >> " + SPRING.getAllMonth());
            }
            case "6" -> {
                System.out.println(SUMMER.getFirstMonth() + " >> June >> " + SUMMER.getAllMonth());
            }
            case "7" -> {
                System.out.println(SUMMER.getSecondMonth() + " >> July >> " + SUMMER.getAllMonth());
            }
            case "8" -> {
                System.out.println(SUMMER.getThirdMonth() + " >> August >> " + SUMMER.getAllMonth());
            }
            case "9" -> {
                System.out.println(AUTUMN.getFirstMonth() + " >> September >> " + AUTUMN.getAllMonth());
            }
            case "10" -> {
                System.out.println(AUTUMN.getSecondMonth() + " >> October >> " + AUTUMN.getAllMonth());
            }
            case "11" -> {
                System.out.println(AUTUMN.getThirdMonth() + " >> November >> " + AUTUMN.getAllMonth());
            }
            case "12" -> {
                System.out.println(WINTER.getFirstMonth() + " >> December >> " + WINTER.getAllMonth());
            }
            default -> {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    System.out.print("UNEXPECTED VALUE: " + num +
                            "\n(!) Yon can use only one of the next numbers ->\n" +
                            "\t-> 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12\n" +
                            "\tPLEASE TRY AGAIN: ");
                    checkMonth(sc.next());
                }
            }
        }   //switch
    }   //checkMonth

}
