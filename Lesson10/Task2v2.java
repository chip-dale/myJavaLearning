/*
 * В класс Human(из предыдущего д.з.) добавить:
 * конструктор по умолчанию
 * конструктор принимающий все значения
 */
public class Task2v2 {
    public static void main(String[] args) {
        Human2 model1 = new Human2("Robbie", 1, 3, 2055, 200, 230, true);
        Human2 model2 = new Human2("Gloria", 22, 9, 2050, 12.6, 112.5, false);

        String Name = "Name >> ";
        String Birthday = "Birthday (dd.mm.yy) >> ";
        String Height = "Height (cm) >> ";
        String Weight = "Weight (kg) >> ";
        String Robot = "Robot >> ";

        System.out.println("MODELS OF \"HUMAN\"");

        System.out.println("\n\t#1:");
        System.out.println(Name + model1.name);
        System.out.println(Robot + model1.isRobot);
        System.out.println(Birthday + model1.birthday());
        System.out.println(Height + model1.height);
        System.out.println(Weight + model1.weight);

        System.out.println("\n\t#2:");
        System.out.println(Name + model2.name);
        System.out.println(Robot + model2.isRobot);
        System.out.println(Birthday + model2.birthday());
        System.out.println(Height + model2.height);
        System.out.println(Weight + model2.weight);
    }
}

class Human2 {
    String name;
    int dayBirthday;
    int monthBirthday;
    int yearBirthday;
    double weight;
    double height;
    boolean isRobot;
    String birthday() {
        return dayBirthday + "." + monthBirthday + "." + yearBirthday;
    }

    Human2() {
        //конструктор по умолчанию
    }

    Human2(String name, int day, int month, int year, double w, double h, boolean robot) {
        //конструктор принимающий все значения
        this.name = name;
        dayBirthday = day;
        monthBirthday = month;
        yearBirthday = year;
        weight = w;
        height = h;
        isRobot = robot;
    }
}
//TODO: Special for "U.S.Robotics"