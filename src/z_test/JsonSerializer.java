package z_test;

import static java.util.Objects.requireNonNull;
import static java.util.stream.Collectors.joining;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {

  public String serialize(Object object) throws JsonSerializeException {

    try {
      Class<?> objectClass = requireNonNull(object).getClass();
      Map<String, String> jsonElements = new HashMap<>();

      for (Field field : objectClass.getDeclaredFields()) {
        field.setAccessible(true);
        if (field.isAnnotationPresent(JsonField.class)) {
          jsonElements.put(getSerializedKey(field), (String) field.get(object));
        }
      }

      System.out.println(toJsonString(jsonElements));
      return toJsonString(jsonElements);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
      throw new JsonSerializeException(e.getMessage());
    }
  }

  private String toJsonString(Map<String, String> jsonMap) {
    String elementString = jsonMap.entrySet()
        .stream()
        .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
        .collect(joining(","));

    return "{" + elementString + "}";
  }

  private String getSerializedKey(Field field) {
    String annotationValue = field.getAnnotation(JsonField.class).value();

    if (annotationValue.isEmpty()) {
      return field.getName();
    } else {
      return annotationValue;
    }
  }
}
