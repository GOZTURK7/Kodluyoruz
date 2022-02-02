package ComparatorInterface_Calısması_Youtube;

import java.util.Comparator;

public class ComparatorPeopleName implements Comparator<Peoples> {


    @Override
    public int compare(Peoples o1, Peoples o2) {

        return o1.getName().compareTo(o2.getName());

    }
}
