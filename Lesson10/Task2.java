/*
 * В класс Human(из предыдущего д.з.) добавить:
 * конструктор по умолчанию
 * конструктор принимающий все значения
 */
public class Task2 {
    public static void main(String[] args) {
        Human txt = new Human();

        Human model1 = new Human("Robbie", 1, 3, 2055, 200, 230, true);
        Human model2 = new Human("Gloria", 22, 9, 2050, 12.6, 112.5, false);

        System.out.println("MODELS OF \"HUMAN\"");

        System.out.println("\n\t#1:");
        System.out.println(txt.Name + model1.name);
        System.out.println(txt.Robot + model1.isRobot);
        System.out.println(txt.Birthday + model1.birthday());
        System.out.println(txt.Height + model1.height);
        System.out.println(txt.Weight + model1.weight);

        System.out.println("\n\t#2:");
        System.out.println(txt.Name + model2.name);
        System.out.println(txt.Robot + model2.isRobot);
        System.out.println(txt.Birthday + model2.birthday());
        System.out.println(txt.Height + model2.height);
        System.out.println(txt.Weight + model2.weight);
    }
}

class Human {
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

    String Name = "Name >> ";
    String Birthday = "Birthday (dd.mm.yy) >> ";
    String Height = "Height (cm) >> ";
    String Weight = "Weight (kg) >> ";
    String Robot = "Robot >> ";

    Human() {
        //конструктор по умолчанию
    }

    Human(String name, int day, int month, int year, double w, double h, boolean robot) {
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