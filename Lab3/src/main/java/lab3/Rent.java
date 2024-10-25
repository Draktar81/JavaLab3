package lab3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Rent implements Comparable<Rent> {
    private Room room;
    private Customer customer;
    private String dateOfStart;
    private String dateOfEnd;
    private String paymentDetails;
    private double price;

    // Default constructor required for Jackson
    public Rent() {}

    // Constructor using @JsonProperty annotations to explicitly map fields
    @JsonCreator
    public Rent(@JsonProperty("room") Room room,
                @JsonProperty("customer") Customer customer,
                @JsonProperty("dateOfStart") String dateOfStart,
                @JsonProperty("dateOfEnd") String dateOfEnd,
                @JsonProperty("paymentDetails") String paymentDetails,
                @JsonProperty("price") double price) {
        this.room = room;
        this.customer = customer;
        this.dateOfStart = dateOfStart;
        this.dateOfEnd = dateOfEnd;
        this.paymentDetails = paymentDetails;
        this.price = price;
    }

    @Override
    public int compareTo(Rent other) {
        return this.dateOfStart.compareTo(other.dateOfStart);
    }

    // Getters and setters
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public String getDateOfEnd() {
        return dateOfEnd;
    }

    public void setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "room=" + room +
                ", customer=" + customer +
                ", dateOfStart='" + dateOfStart + '\'' +
                ", dateOfEnd='" + dateOfEnd + '\'' +
                ", paymentDetails='" + paymentDetails + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return Double.compare(price, rent.price) == 0 &&
                Objects.equals(room, rent.room) &&
                Objects.equals(customer, rent.customer) &&
                Objects.equals(dateOfStart, rent.dateOfStart) &&
                Objects.equals(dateOfEnd, rent.dateOfEnd) &&
                Objects.equals(paymentDetails, rent.paymentDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(room, customer, dateOfStart, dateOfEnd, paymentDetails, price);
    }
}
