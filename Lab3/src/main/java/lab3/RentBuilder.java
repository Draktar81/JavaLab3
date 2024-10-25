package lab3;

public class RentBuilder {
    private Room room;
    private Customer customer;
    private String dateOfStart;
    private String dateOfEnd;
    private String paymentDetails;
    private double price;

    // Setters for each field return the builder instance for method chaining
    public RentBuilder setRoom(Room room) {
        this.room = room;
        return this;
    }

    public RentBuilder setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public RentBuilder setDateOfStart(String dateOfStart) {
        this.dateOfStart = dateOfStart;
        return this;
    }

    public RentBuilder setDateOfEnd(String dateOfEnd) {
        this.dateOfEnd = dateOfEnd;
        return this;
    }

    public RentBuilder setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
    }

    public RentBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    // The build method now calls the Rent constructor directly with the fields
    public Rent build() {
        return new Rent(room, customer, dateOfStart, dateOfEnd, paymentDetails, price);
    }
}
