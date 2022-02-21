package se.marcus.microservices.locationservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String address;

    private double rate;

    private String currency;

    private String coordinates;

    public Location(String name, String address, double rate, String currency) {
        this.name = name;
        this.address = address;
        this.rate = rate;
        this.currency = currency;
    }

    public Location() {
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(String coordinates) {
        this.coordinates = coordinates;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return Double.compare(location.getRate(), getRate()) == 0 && getId().equals(location.getId()) && getName().equals(location.getName()) && getAddress().equals(location.getAddress()) && Objects.equals(getCoordinates(), location.getCoordinates());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAddress(), getRate(), getCoordinates());
    }
}
