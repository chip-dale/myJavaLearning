import java.util.Scanner;

/**
 * Создать музыкальный плеер:
 * interface MusicPlayer:
 * Воспроизвести песню
 * Остановить песню
 * Следующая песня
 * Предыдущая песня
 * Поиск по жанру
 * Поиск по названию
 *
 * Создать класс Song:
 * Имя исполнителя
 * Жанр (enum)
 * Название песни
 *
 * Создать класс имплементирующий интерфейс:
 * Содержит список песен.
 * При реализации методов выводить на монитор воспроизводимую на данный момент песню
 * Если поиск не дал результатов вывести MusicPlayerException c сообщением:
 * "Песня с {названием или жанром} не найдена"
 * Если дошли до конца списка песен выводить PlayListException c сообщением
 *
 * Создать новый плеер с дополнительными возможностями
 * Дать пользователю возможность выбора зацикливания списка
 * Дать пользователю возможность перемешивания списка
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Song[] list = new Song[5];
        int i = 0;
        list[0] = new Song("Michael Jackson","Smooth Criminal",Genre.POP);
        list[1] = new Song("Unknown Artist","Single 1",Genre.UNKNOWN);
        list[2] = new Song("Nina Simone","blablabla",Genre.JAZZ);
        list[3] = new Song("Metallica","Nothing Else Matters",Genre.ROCK);
        list[4] = new Song("ЦОЙ","группа крови",Genre.ROCK);
        Player p = new Player(list,i);
        System.out.println(ConsoleColors.PURPLE_UNDERLINED + "MY PLAYLIST:" + ConsoleColors.RESET);
        for (i = 0; i < 5; i++) {
            System.out.println(ConsoleColors.CYAN_BOLD + list[i] + ConsoleColors.RESET);
        }
        System.out.println();


        System.out.println("PLAY: " + p.play());
        p.next();
        System.out.println("PLAY: " + p.play());
        p.previous();
        System.out.println("PLAY: " + p.play());
        while (true) {
            // ИСКЛЮЧИТЕЛЬНЫЙ КОТ НЕ СУЩЕСТВУЕТ (=^..^=)
            try {
                p.next();
                System.out.println("PLAY: " + p.play());
                throw new PlayListException();
            } catch (PlayListException e) {
                System.out.println(ConsoleColors.RED_BACKGROUND + "Вы дошли до конца списка песен" + ConsoleColors.RESET);
            }
        }
    }
}
