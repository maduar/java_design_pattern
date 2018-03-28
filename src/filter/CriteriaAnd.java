package filter;

import java.util.List;

/*
 *
 * @author maduar
 * @date 28/03/2018 10:33 AM
 * @email maduar@163.com
 *
 * */
public class CriteriaAnd implements Criteria {
  private Criteria criteria;
  private Criteria otherCriteria;

  public CriteriaAnd(Criteria criteria, Criteria otherCriteria) {
    this.criteria = criteria;
    this.otherCriteria = otherCriteria;
  }


  @Override
  public List<Person> meetCriteria(List<Person> persons) {
    List<Person> criteriaList = criteria.meetCriteria(persons);
    return otherCriteria.meetCriteria(criteriaList);
  }
}
