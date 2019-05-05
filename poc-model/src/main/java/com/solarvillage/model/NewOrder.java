package com.solarvillage.model;

import java.io.Serializable;
import java.util.Date;

public class NewOrder implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String id;
    protected String name;
    protected String address;
    protected boolean hasHOA;
    protected Date nextHOAMeeting;

    public NewOrder() {};

    public NewOrder(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isHasHOA() {
        return hasHOA;
    }

    public void setHasHOA(boolean hasHOA) {
        this.hasHOA = hasHOA;
    }

    public Date getNextHOAMeeting() {
        return nextHOAMeeting;
    }

    public void setNextHOAMeeting(Date nextHOAMeeting) {
        this.nextHOAMeeting = nextHOAMeeting;
    }
}