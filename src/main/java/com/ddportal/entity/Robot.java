package com.ddportal.entity;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "robots")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Robot implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @JsonProperty("robot_id")
    private Integer robotId;

    @Enumerated(EnumType.STRING)
    @JsonProperty("type")
    private RobotType type;

    @Enumerated(EnumType.STRING)
    @JsonProperty("status")
    private RobotStatus status;

    @JsonProperty("center")
    private String center;

    public Integer getRobotId() {
        return robotId;
    }

    public void setRobotId(Integer robotId) {
        this.robotId = robotId;
    }

    public RobotType getType() {
        return type;
    }

    public void setType(RobotType type) {
        this.type = type;
    }

    public RobotStatus getStatus() {
        return status;
    }

    public void setStatus(RobotStatus status) {
        this.status = status;
    }

    public String getCenter() {
        return center;
    }

    public void setCenter(String center) {
        this.center = center;
    }
}
