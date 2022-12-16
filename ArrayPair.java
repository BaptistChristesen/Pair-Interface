
/**
 * Write a description of class ArrayPair here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class ArrayPair<T> implements PairInterface<T>
{
    private T[] pair;
    public ArrayPair(T first, T second)
    {
       pair = (T[]) new Object[2];   
       pair[0]= first;
       pair[1]= second;
    }

    public void setFirst(T x){
        pair[0] = x;
    }
    public void setSecond(T x){
        pair[1] = x;
    }
    public T getFirst(){
        return pair[0];
    }
    public T getSecond(){
        return pair[1];
    }
}
