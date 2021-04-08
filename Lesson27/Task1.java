import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Создать класс customer c полями id, name, surname.
 * Создать лист из несколькоких кастомеров.
 * С помощью стрим апи перевести лист в Map где ключ будет id, а value сам объект customer.
 */
public class Task1 {
    public static void main(String[] args) {

        int id = 0;
        List<Customer> customers = Arrays.asList(
                new Customer(++id,"Кролик","Белый"),
                new Customer(++id,"Кот","Чеширский"),
                new Customer(++id,"Заяц","Мартовский"),
                new Customer(++id,"Шляпник","Безумный"),
                new Customer(++id,"Соня","Мышь")
        );
        System.out.println(customers);

        Map<String, Customer> map =
                customers.stream().collect(Collectors.toMap(Customer :: getKey, value -> value));
        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

class Customer {
    private int id;
    private String name;
    private String surname;

    Customer(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public String getKey(){
        return "Key-" + id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}

//  https://ru.stackoverflow.com/questions/765563/%D0%9F%D0%BE%D0%B8%D1%81%D0%BA-%D0%B8-%D0%B4%D0%BE%D0%B1%D0%B0%D0%B2%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5-%D1%8D%D0%BB%D0%B5%D0%BC%D0%B5%D0%BD%D1%82%D0%BE%D0%B2-%D0%B8%D0%B7-map-%D0%B2-list-java-stream-api
//  https://coderoad.ru/52126290/Java-8-%D0%BF%D0%BE%D1%82%D0%BE%D0%BA-%D1%81%D0%BE%D0%B7%D0%B4%D0%B0%D0%BD%D0%B8%D0%B5-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%B0-%D0%B8%D0%B7-%D0%BA%D0%B0%D1%80%D1%82%D1%8B-%D0%BE%D0%B1%D1%8A%D0%B5%D0%BA%D1%82%D0%BE%D0%B2
//  https://annimon.com/article/2778
//  https://overcoder.net/q/32660/java-%D0%BA%D0%B0%D0%BA-%D0%BF%D1%80%D0%B5%D0%BE%D0%B1%D1%80%D0%B0%D0%B7%D0%BE%D0%B2%D0%B0%D1%82%D1%8C-%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA-%D0%B2-%D0%BA%D0%B0%D1%80%D1%82%D1%83
