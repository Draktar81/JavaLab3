package lab3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Customer {
    private String name;
    private String surname;
    private String document;
    private String dateOfBirth;

    // Default constructor required by Jackson for deserialization
    public Customer() {}

    // Constructor with @JsonCreator and @JsonProperty annotations
    @JsonCreator
    public Customer(@JsonProperty("name") String name,
                    @JsonProperty("surname") String surname,
                    @JsonProperty("document") String document,
                    @JsonProperty("dateOfBirth") String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.document = document;
        this.dateOfBirth = dateOfBirth;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", document='" + document + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(document, customer.document) &&
                Objects.equals(dateOfBirth, customer.dateOfBirth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, document, dateOfBirth);
    }
}
