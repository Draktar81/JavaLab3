package lab3;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Room {
    private String type;
    private int bedCount;
    private int number;
    private String comfortables;

    // Default constructor required by Jackson for deserialization
    public Room() {}

    // Constructor annotated with @JsonCreator and @JsonProperty for Jackson
    @JsonCreator
    public Room(@JsonProperty("type") String type,
                @JsonProperty("bedCount") int bedCount,
                @JsonProperty("number") int number,
                @JsonProperty("comfortables") String comfortables) {
        this.type = type;
        this.bedCount = bedCount;
        this.number = number;
        this.comfortables = comfortables;
    }

    // Getters and setters
    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getComfortables() {
        return comfortables;
    }

    public void setComfortables(String comfortables) {
        this.comfortables = comfortables;
    }

    @Override
    public String toString() {
        return "Room{" +
                "type='" + type + '\'' +
                ", bedCount=" + bedCount +
                ", number=" + number +
                ", comfortables='" + comfortables + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Room room = (Room) o;
        return bedCount == room.bedCount && number == room.number &&
                Objects.equals(type, room.type) &&
                Objects.equals(comfortables, room.comfortables);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, bedCount, number, comfortables);
    }
}
