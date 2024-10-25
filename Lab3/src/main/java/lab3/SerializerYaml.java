package lab3;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

import java.io.File;
import java.io.IOException;

public class SerializerYaml implements ISerializable<Rent> {
    private final YAMLMapper yamlMapper = new YAMLMapper();

    @Override
    public void serialize(Rent rent, File file) throws IOException {
        yamlMapper.writeValue(file, rent);
    }

    @Override
    public Rent deserialize(File file) throws IOException {
        return yamlMapper.readValue(file, Rent.class);
    }
}
