import java.util.*;
public class FiniteList<E> extends ArrayList<E>
{
    private int sizeLimit;
    
    public FiniteList(int x) {
        sizeLimit = x;
    }
    
    public boolean add(E obj) {
        if(sizeLimit > this.size()) {
            super.add(obj);
            return true;
        }
        return false;
    }
    
    public void add(int index, E obj) {
        if(sizeLimit > this.size()) {
            super.add(index, obj);
        }
        if(sizeLimit == this.size()) {
            super.set(index, obj);
        }
    }
}
