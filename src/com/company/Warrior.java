package com.company;

public class Warrior extends Player implements SuperAbilyty {private String name;
private int specialAbbilyty;

    public int getSpecialAbbilyty() {
        return specialAbbilyty;
    }

    public void setSpecialAbbilyty(int specialAbbilyty) {
        this.specialAbbilyty = specialAbbilyty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void SpecialAttack() {


        }

    @Override
    public void FastAttack() {

    }
}

