package org.legital.roommanagement.domain;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "BUILDING") // not required, default table name is equal to class name
public class Building {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false)
    private Character code;
    private String description;
    private LocalDate constructionDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Character getCode() {
        return code;
    }

    public void setCode(Character code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getConstructionDate() {
        return constructionDate;
    }

    public void setConstructionDate(LocalDate constructionDate) {
        this.constructionDate = constructionDate;
    }
}
