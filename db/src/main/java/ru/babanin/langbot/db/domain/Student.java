package ru.babanin.langbot.db.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String paswordNumber;
}
