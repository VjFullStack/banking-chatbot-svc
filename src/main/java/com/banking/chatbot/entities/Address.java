package com.banking.chatbot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Address {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String addressLine1;

    @Column
    private String addressLine2;

    @Column
    private String landmark;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
    private String pincode;

    public Address() {
    }

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getLandmark() {
        return landmark;
    }

    public void setLandmark(String landmark) {
        this.landmark = landmark;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    // constructor
    public Address(Long id, String addressLine1, String addressLine2, String landmark, String city, String state, String pincode) {
        this.id = id;
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.landmark = landmark;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    // hashCode and equals methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Address address)) return false;

        if (!id.equals(address.id)) return false;
        if (!addressLine1.equals(address.addressLine1)) return false;
        if (!addressLine2.equals(address.addressLine2)) return false;
        if (!landmark.equals(address.landmark)) return false;
        if (!city.equals(address.city)) return false;
        if (!state.equals(address.state)) return false;
        return pincode.equals(address.pincode);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + addressLine1.hashCode();
        result = 31 * result + addressLine2.hashCode();
        result = 31 * result + landmark.hashCode();
        result = 31 * result + city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + pincode.hashCode();
        return result;
    }
}
