package org.legital.roommanagement.domain;

import javax.persistence.Entity;

@Entity
public class ClassRoom extends Room {
    private Boolean smartboardPresent;

    public Boolean getSmartboardPresent() {
        return smartboardPresent;
    }

    public void setSmartboardPresent(Boolean smartboardPresent) {
        this.smartboardPresent = smartboardPresent;
    }
}
