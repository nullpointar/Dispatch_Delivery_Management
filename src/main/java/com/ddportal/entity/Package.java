package com.ddportal.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "packages")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Package implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("package_id")
    private int packageId;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonProperty("user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name="task_id")
    @JsonProperty("task_id")
    private Task task;

    @JsonProperty("weight")
    private float weight;

    @Column(name = "dimension")
    @JsonProperty("dimension")
    private String dimension;

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User User) {
        this.user = User;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}