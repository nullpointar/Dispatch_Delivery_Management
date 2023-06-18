package com.ddportal.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "addresses")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("address_id")
    private Integer addressId;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonProperty("user_id")
    private User user;

    @Column(length = 50)
    @JsonProperty("address_line_1")
    private String addressLine1;

    @Column(length = 20)
    @JsonProperty("address_line_2")
    private String addressLine2;

    @Column(length = 20)
    @JsonProperty("city")
    private String city;

    @Column(length = 20)
    @JsonProperty("state")
    private String state;

    @Column(length = 20)
    @JsonProperty("country")
    private String country;

    @Column(length = 5)
    @JsonProperty("zip_code")
    private String zipCode;

    // getters and setters...

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}