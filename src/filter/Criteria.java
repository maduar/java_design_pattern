package filter;

import java.util.List;
/**
 * Created by maduar on 30/10/2017.
 */
public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
