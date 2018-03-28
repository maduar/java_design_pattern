package filter;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author maduar
 * @date 28/03/2018 10:09 AM
 * @email maduar@163.com
 *
 * */
public class CriterFemale implements Criteria {
  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> femalePersons = new ArrayList<Person>();
    for (Person person : persons) {
      if (person.getGender().equalsIgnoreCase("FEMALE")) {
        femalePersons.add(person);
      }
    }
    return femalePersons;
  }
}
