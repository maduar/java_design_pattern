package z_test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Todo {
  public enum Priority {LOW, MEDIUM, HIGHT}
  public enum Status {STARTED, NOT_STARTED}

  String author() default "Yash";
  Priority priority() default Priority.LOW;
  Status status() default Status.NOT_STARTED;
}
