package filter;

import java.util.List;

/*
 *
 * @author maduar
 * @date 28/03/2018 10:37 AM
 * @email maduar@163.com
 *
 * */
public class CriteriaOr implements Criteria{

  private Criteria criteria;
  private Criteria otherCriteria;

  public CriteriaOr(Criteria criteria, Criteria otherCriteria) {
    this.criteria = criteria;
    this.otherCriteria = otherCriteria;
  }

  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> criteriaList = criteria.meetCriteria(persons);
    List<Person> otherCriteriaList = otherCriteria.meetCriteria(persons);

    for(Person p: criteriaList) {
      if (!otherCriteriaList.contains(p)) {
        otherCriteriaList.add(p);
      }
    }
    return otherCriteriaList;
  }
}
