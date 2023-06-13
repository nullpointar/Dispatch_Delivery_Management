package com.ddportal.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "user_id")
    @JsonProperty("user_id")
    private String userId; 

    @Enumerated(value = EnumType.STRING)
    @JsonProperty("user_type")
    private UserType userType;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("user_name")
    private String userName;

    @JsonProperty("password")
    private String encryptedPassword;

    @JsonProperty("email")
    private String emailAddress;

    @JsonProperty("phone_number")
    private String phoneNumber;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonProperty("addresses")
    private Set<Address> addresses;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonProperty("tasks")
    private Set<Task> tasks;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonProperty("packages")
    private Set<Package> packages;

    public String getUserId() { return userId; } 
    public void setUserId(String userId) { this.userId = userId; }

    public UserType getUserType() { return userType; } 
    public void setUserType(UserType userType) { this.userType = userType; }

    public String getFirstName() { return firstName; } 
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; } 
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getUserName() { return userName; } 
    public void setUserName(String userName) { this.userName = userName; }

    public String getEncryptedPassword() { return encryptedPassword; } 
    public void setEncryptedPassword(String encryptedPassword) { this.encryptedPassword = encryptedPassword; }

    public String getEmailAddress() { return emailAddress; } 
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public String getPhoneNumber() { return phoneNumber; } 
    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public Set<Address> getAddresses() { return addresses; } 
    public void setAddresses(Set<Address> addresses) { this.addresses = addresses; }

    public Set<Task> getTasks() { return tasks; } 
    public void setTasks(Set<Task> tasks) { this.tasks = tasks; }

    public Set<Package> getPackages() { return packages; } 
    public void setPackages(Set<Package> packages) { this.packages = packages; }

}
