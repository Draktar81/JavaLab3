    package lab3;

    import com.fasterxml.jackson.databind.ObjectMapper;

    import java.io.File;
    import java.io.IOException;

    public class SerializerJson implements ISerializable<Rent> {
        private final ObjectMapper mapper = new ObjectMapper();

        @Override
        public void serialize(Rent rent, File file) throws IOException {
            mapper.writeValue(file, rent);
        }

        @Override
        public Rent deserialize(File file) throws IOException {
            return mapper.readValue(file, Rent.class);
        }
    }
