package com.ddportal.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tasks")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Task implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("task_id")
    private Integer taskId;

    @ManyToOne
    @JoinColumn(name="user_id")
    @JsonProperty("user_id")
    private User user;

    @JsonProperty("robot_id")
    private String robotId;

    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private TaskStatus status;

    @JsonProperty("pickup_location")
    private String pickupLocation;

    @JsonProperty("destination")
    private String destination;

    @JsonProperty("cost_estimated")
    private float costEstimated;

    @JsonProperty("time_estimated")
    private String timeEstimated;

    @JsonProperty("route")
    private String route;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRobotId() {
        return robotId;
    }

    public void setRobotId(String robotId) {
        this.robotId = robotId;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public float getCostEstimated() {
        return costEstimated;
    }

    public void setCostEstimated(float costEstimated) {
        this.costEstimated = costEstimated;
    }

    public String getTimeEstimated() {
        return timeEstimated;
    }

    public void setTimeEstimated(String timeEstimated) {
        this.timeEstimated = timeEstimated;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }
}