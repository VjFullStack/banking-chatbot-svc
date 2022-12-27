package com.banking.chatbot.entities;

import org.threeten.bp.LocalDate;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Account {
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String contact;

    @OneToOne(cascade = CascadeType.ALL)
    private Address currentAddress;

    @OneToOne(cascade = CascadeType.ALL)
    private Address permanentAddress;

    @Column(nullable = false)
    private String accountType;

    @Column(nullable = false)
    private String panNumber;

    @OneToOne(cascade = CascadeType.ALL)
    private Identification identification;

    @Column(nullable = false)
    private LocalDate openDate;

    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Address getCurrentAddress() {
        return currentAddress;
    }

    public void setCurrentAddress(Address currentAddress) {
        this.currentAddress = currentAddress;
    }

    public Address getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(Address permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getPanNumber() {
        return panNumber;
    }

    public void setPanNumber(String panNumber) {
        this.panNumber = panNumber;
    }

    public Identification getIdentification() {
        return identification;
    }

    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public LocalDate getOpenDate() {
        return openDate;
    }

    public void setOpenDate(LocalDate openDate) {
        this.openDate = openDate;
    }

    // constructor

    public Account() {

    }

    public Account(Long id, String name, String contact, Address currentAddress, String accountType, String panNumber, LocalDate openDate) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.currentAddress = currentAddress;
        this.accountType = accountType;
        this.panNumber = panNumber;
        this.openDate = openDate;
    }


    // hashCode and equals methods

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;

        if (!id.equals(account.id)) return false;
        if (!name.equals(account.name)) return false;
        if (!contact.equals(account.contact)) return false;
        if (!currentAddress.equals(account.currentAddress)) return false;
        if (!Objects.equals(permanentAddress, account.permanentAddress))
            return false;
        if (!accountType.equals(account.accountType)) return false;
        if (!panNumber.equals(account.panNumber)) return false;
        if (!Objects.equals(identification, account.identification))
            return false;
        return openDate.equals(account.openDate);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + contact.hashCode();
        result = 31 * result + currentAddress.hashCode();
        result = 31 * result + (permanentAddress != null ? permanentAddress.hashCode() : 0);
        result = 31 * result + accountType.hashCode();
        result = 31 * result + panNumber.hashCode();
        result = 31 * result + (identification != null ? identification.hashCode() : 0);
        result = 31 * result + openDate.hashCode();
        return result;
    }
}

