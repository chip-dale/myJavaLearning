/*
 * Создать класс Human. Свойства:
День рождения
Месяц рождения
Год рождения
Вес
Рост

Создать два объекта класса Human. Задать значения.
 */
public class Task1 {
    public static void main(String[] args) {
        Human model1 = new Human();
        Human model2 = new Human();

        model1.name = "Robbie";
        model1.dayBirthday = 1;
        model1.monthBirthday = 3;
        model1.yearBirthday = 2055;
        model1.weight = 200;
        model1.height = 230;
        model1.isRobot = true;

        model2.name = "Gloria";
        model2.dayBirthday = 22;
        model2.monthBirthday = 9;
        model2.yearBirthday = 2050;
        model2.weight = 12.6;
        model2.height = 112.5;
        model2.isRobot = false;

        System.out.println("MODELS OF \"HUMAN\"");

        System.out.println("\n\t#1:");
        System.out.println(model1.txtName + model1.name);
        System.out.println(model1.txtRobot + model1.isRobot);
        System.out.print(model1.txtBirthday); model1.birthday();
        System.out.println(model1.txtHeight + model1.height);
        System.out.println(model1.txtWeight + model1.weight);

        System.out.println("\n\t#2:");
        System.out.println(model2.txtName + model2.name);
        System.out.println(model2.txtRobot + model2.isRobot);
        System.out.print(model2.txtBirthday); model2.birthday();
        System.out.println(model2.txtHeight + model2.height);
        System.out.println(model2.txtWeight + model2.weight);
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
    void birthday() {
        System.out.println(dayBirthday + "." + monthBirthday + "." + yearBirthday);
    }
    String txtName = "Name >> ";
    String txtBirthday = "Birthday (dd.mm.yy) >> ";
    String txtHeight = "Height (cm) >> ";
    String txtWeight = "Weight (kg) >> ";
    String txtRobot = "Robot >> ";
}
//TODO: Special for "U.S.Robotics"