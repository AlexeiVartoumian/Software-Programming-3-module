package ExamPrac2021.q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class IteratorImple implements Iterator {

    int index;
    ArrayList<String> somearray;

    HashMap<Integer , String> evenEnum;
    public IteratorImple(ArrayList<String> somearray){
        this.somearray = somearray;
        index = 0;
        evenEnum = new HashMap<>();
    }

    public void  setEvenEnum(){
        int curpoint = index;
        while (curpoint > 0 && !evenEnum.containsKey(curpoint) ){
            if (curpoint % 2 == 0 && !evenEnum.containsKey(curpoint)) {
                evenEnum.put(curpoint, somearray.get(curpoint));
            }
            curpoint-=1;
        }
    }

    @Override
    public boolean hasNext(){
        return index < somearray.size();
    }
    @Override
    public String next(){
        if (hasNext() ){
            String res = somearray.get(index);
            index++;
            return res;
        }
        return null;
    }
}
