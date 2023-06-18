package com.ddportal.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("payment_id")
    private Integer paymentId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonProperty("user_id")
    private User user;

    @JsonProperty("card_number")
    private String cardNumber;

    @JsonProperty("holder_name")
    private String holderName;

    @JsonProperty("cvv")
    private Integer cvv;

    @JsonProperty("expiration_date")
    private String expirationDate;

    @JsonProperty("billing_address")
    private String billingAddress;

    // getters and setters...

    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public Integer getCvv() {
        return cvv;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }
}