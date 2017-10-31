package filter;

import java.util.List;
import java.util.ArrayList;

/**
 * Created by maduar on 30/10/2017.
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria (List<Person> persons) {

        List<Person> malePersons = new ArrayList<Person>();
        for(Person person: persons) {
            if (person.getGender().equalsIgnoreCase("MALE")) {
                malePersons.add(person);
            }
        }

        return malePersons;
    }

}
