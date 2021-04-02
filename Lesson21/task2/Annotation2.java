package task2;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

public @interface Annotation2 {
    int value();
}
