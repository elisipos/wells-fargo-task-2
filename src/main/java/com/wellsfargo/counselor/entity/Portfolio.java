package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue
    private long portfolioId;

    @Column(nullable = false)
    private Date date;

    @OneToOne
    @JoinColumn(name="clientId", nullable = false)
    private Client client;

    protected Portfolio() {

    }

    public Portfolio(Date date, Client client) {
        this.date = date;
        this.client = client;
    }

    public long getPortfolioId() { return portfolioId; }

    public void setDate(Date date) { this.date = date; }

    public Date getDate() { return date; }

    public Client getClient() { return client; }

    public void setClient(Client client) { this.client = client; }

}
