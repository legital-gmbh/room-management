package org.legital.roommanagement.domain;

import javax.persistence.Entity;

@Entity
public class ConferenceRoom extends Room {
    private String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
