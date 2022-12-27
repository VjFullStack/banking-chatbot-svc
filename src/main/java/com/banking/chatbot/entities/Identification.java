package com.banking.chatbot.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Identification {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String driverLicense;

    @Column
    private String passport;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    // constructor

    public Identification() {
    }

    public Identification(Long id) {
        this.id = id;
    }

    // hashCode and equals methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Identification that)) return false;

        if (!id.equals(that.id)) return false;
        if (!Objects.equals(driverLicense, that.driverLicense))
            return false;
        return Objects.equals(passport, that.passport);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + (driverLicense != null ? driverLicense.hashCode() : 0);
        result = 31 * result + (passport != null ? passport.hashCode() : 0);
        return result;
    }
}
