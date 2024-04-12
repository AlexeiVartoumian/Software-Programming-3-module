package Exam2022.Q9;

import java.util.ArrayList;
import java.util.Iterator;
class MyList<A> implements MeList<A> {
    ArrayList<A> l = new ArrayList<A>();
    MyList(ArrayList<A> ll) {
        l = ll;
    }
    public void filter(Filter<A> f) {
        for (Iterator<A> i = l.iterator(); i.hasNext();) {
            if (!f.test(i.next())) { // don’t forget the negation!
                i.remove();
            }
        }
    }
}
