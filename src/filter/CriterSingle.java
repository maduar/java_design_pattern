package filter;

import java.util.ArrayList;
import java.util.List;

/*
 *
 * @author maduar
 * @date 28/03/2018 10:19 AM
 * @email maduar@163.com
 *
 * */
public class CriterSingle implements Criteria{
  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> personList = new ArrayList<Person>();

    for (Person p : persons) {
      if (p.getMaritalStatus().equalsIgnoreCase("SINGLE")) {
        personList.add(p);
      }
    }
    return personList;
  }
}
