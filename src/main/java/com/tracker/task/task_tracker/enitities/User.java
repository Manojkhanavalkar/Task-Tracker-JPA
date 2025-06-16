package com.tracker.task.task_tracker.enitities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_user")
public class User {

    @Id
    @Column(name = "user_id")
    private int id;

    @Column(name = "user_name")
    private String name;

    @OneToOne
    private IpAddress ipAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IpAddress getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(IpAddress ipAddress) {
        this.ipAddress = ipAddress;
    }
}
