package task2;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface Annotation1 {
    String name();
}
