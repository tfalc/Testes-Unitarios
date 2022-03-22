package com.tfalcao.unitarytests;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

    private String name;
    private LocalDate birth;

    public Pessoa(String name, LocalDate birth) {
        this.name = name;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.birth, LocalDate.now());
    }
}
