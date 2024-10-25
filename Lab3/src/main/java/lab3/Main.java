package lab3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        Room room = new Room("Luxury", 5,301, "Best of the best");
        Customer customer = new Customer("Vilanti", "Krabino", "received", "15.10.1998");

        Rent rent = new RentBuilder()
                .setRoom(room)
                .setCustomer(customer)
                .setDateOfEnd("10.10.2024")
                .setDateOfStart("02.10.2024")
                .setPrice(765.0)
                .setPaymentDetails("card")
                .build();

        try {
            SerializerJson jsonSerializer = new SerializerJson();
            File jsonFile = new File("rent.json");
            jsonSerializer.serialize(rent, jsonFile);
            Rent deserializedRentJson = jsonSerializer.deserialize(jsonFile);
            System.out.println("Deserialized from JSON: " + deserializedRentJson);

            SerializerXml xmlSerializer = new SerializerXml();
            File xmlFile = new File("rent.xml");
            xmlSerializer.serialize(rent, xmlFile);
            Rent deserializedRentXml = xmlSerializer.deserialize(xmlFile);
            System.out.println("Deserialized from XML: " + deserializedRentXml);

            SerializerYaml yamlSerializer = new SerializerYaml();
            File yamlFile = new File("rent.yaml");
            yamlSerializer.serialize(rent, yamlFile);
            Rent deserializedRentYaml = yamlSerializer.deserialize(yamlFile);
            System.out.println("Deserialized from YAML: " + deserializedRentYaml);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}