package lab3;

import java.io.File;
import java.io.IOException;

public interface ISerializable<T> {
    void serialize(T entity, File file) throws IOException;
    T deserialize(File file) throws IOException;
}
