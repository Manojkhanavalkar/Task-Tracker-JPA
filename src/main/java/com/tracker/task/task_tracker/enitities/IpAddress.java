package com.tracker.task.task_tracker.enitities;

import jakarta.persistence.*;

@Entity
@Table(name = "jpa_ipaddress")
public class IpAddress {

    @Id
    @Column(name = "ip_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String ipAddressLoc;

    @OneToOne(mappedBy = "ipAddress")
    private User user;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIpAddressLoc() {
        return ipAddressLoc;
    }

    public void setIpAddressLoc(String ipAddressLoc) {
        this.ipAddressLoc = ipAddressLoc;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
