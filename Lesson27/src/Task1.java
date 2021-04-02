import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Создать класс customer c полями id, name, surname.
 * Создать лист из несколькоких кастомеров.
 * С помощью стрим апи перевести лист в Map где ключ будет id, а value сам объект customer.
 */
public class Task1 {
    public static void main(String[] args) {
        List<Customer> customerList = IntStream.rangeClosed(1, 4)
                .mapToObj(Customer :: new)
                .collect(Collectors.toList());

        Map<String, Customer> map =
                customerList.stream().collect(Collectors.toMap(Customer :: getKey, item -> item));

        map.forEach((k, v) -> System.out.println(k + " => " + v));
    }
}

class Customer {
    private int id;
    private String name;
    private String surname;

    Customer(int id) {
        this.id = id;
    }

    Customer(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getKey(){
        return "Key-" + id;
    }

    public String getValue(){
        return "Value: " + name + surname;
    }
}