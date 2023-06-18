package metier;

import java.io.IOException;
import java.util.List;

public interface IMetier<T> {
    void add(T var1);

    List<T> getAll();

    T findById(long var1);

    void delete(long var1);

    void SaveAll() throws IOException;
}
