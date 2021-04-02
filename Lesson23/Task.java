import java.util.Stack;

/**
 * Создать класс Stack с применением обобщений.
 */
public class Task {
    public static void main(String[] args) {
        Stack<String> balls = new Stack<>();
        balls.add("yellow");
        balls.add("red");
        balls.add("green");

        System.out.println("Colors of Balls:\t" + balls);

        System.out.println("\tPUSH:\t" + balls.push("white"));
        System.out.println("\tPUSH:\t" + balls.push("blue"));
        System.out.println(balls);

        System.out.println("\tPOP:\t" + balls.pop());
        System.out.println(balls);

        System.out.println("\tPEEK:\t" + balls.peek());
        System.out.println("\tPUSH:\t" + balls.push("black"));
        System.out.println(balls);

        System.out.println("\tPOP:\t" + balls.pop());
        System.out.println("\tPEEK:\t" + balls.peek());
        System.out.println(balls);
        System.out.println("\tPOP:\t" + balls.pop());
        System.out.println("\tPEEK:\t" + balls.peek());
        System.out.println(balls);
        System.out.println("\tPOP:\t" + balls.pop());
        System.out.println(balls);
        System.out.println("\tADD:\t" + balls.add("grey")); //разница с push
        System.out.println(balls);
        System.out.println("\tPUSH:\t" + balls.push("blue"));
        System.out.println(balls);

        System.out.println("\tSET:\t" + balls.set(1,"orange"));
        System.out.println(balls);

        System.out.println("\tSIZE:\t" + balls.size());
    }
}
