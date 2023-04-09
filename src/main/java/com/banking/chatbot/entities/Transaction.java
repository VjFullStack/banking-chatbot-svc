package com.banking.chatbot.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

import org.threeten.bp.LocalDateTime;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private Account account;

    @Column(nullable = false)
    private LocalDateTime timestamp;

    @Column(nullable = false)
    private BigDecimal amount;



    // constructors, getters, and setters omitted for brevity


    public Transaction(Long id, Account account, LocalDateTime timestamp, BigDecimal amount) {
        this.id = id;
        this.account = account;
        this.timestamp = timestamp;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", account=" + account +
                ", timestamp=" + timestamp +
                ", amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Transaction that)) return false;
        return getId().equals(that.getId()) && Objects.equals(getAccount(), that.getAccount()) && Objects.equals(getTimestamp(), that.getTimestamp()) && Objects.equals(getAmount(), that.getAmount());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAccount(), getTimestamp(), getAmount());
    }
}

