import java.util.List;

public interface Mapper<S, T>{
    public T map(String s);
    public List<T> mapAll(List<S> s);
}
