package com.banking.chatbot.entities;

import org.threeten.bp.LocalDate;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;
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

    @Column(nullable = false)
    private BigDecimal balance;

    @OneToMany(mappedBy = "account", cascade = CascadeType.ALL)
    private List<Transaction> transactions;
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

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }

    // constructor

    public Account() {

    }

    public Account(Long id, String name, String contact, Address currentAddress, Address permanentAddress, String accountType, String panNumber, Identification identification, LocalDate openDate, BigDecimal balance, List<Transaction> transactions) {
        this.id = id;
        this.name = name;
        this.contact = contact;
        this.currentAddress = currentAddress;
        this.permanentAddress = permanentAddress;
        this.accountType = accountType;
        this.panNumber = panNumber;
        this.identification = identification;
        this.openDate = openDate;
        this.balance = balance;
        this.transactions = transactions;
    }

    // hashCode and equals methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Account account)) return false;
        return id.equals(account.id) && Objects.equals(name, account.name) && Objects.equals(contact, account.contact) && Objects.equals(currentAddress, account.currentAddress) && Objects.equals(permanentAddress, account.permanentAddress) && Objects.equals(accountType, account.accountType) && Objects.equals(panNumber, account.panNumber) && Objects.equals(identification, account.identification) && Objects.equals(openDate, account.openDate) && Objects.equals(balance, account.balance) && Objects.equals(transactions, account.transactions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, contact, currentAddress, permanentAddress, accountType, panNumber, identification, openDate, balance, transactions);
    }
}

