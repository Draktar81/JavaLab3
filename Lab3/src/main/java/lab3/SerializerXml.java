package lab3;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import java.io.IOException;

public class SerializerXml implements ISerializable<Rent> {
    private XmlMapper xmlMapper = new XmlMapper();

    @Override
    public void serialize(Rent rent, File file) throws IOException {
        xmlMapper.writeValue(file, rent);
    }

    @Override
    public Rent deserialize(File file) throws IOException {
        return xmlMapper.readValue(file, Rent.class);
    }
}
