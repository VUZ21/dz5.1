package com.company;

public class Boss {

    private double damage;// урон
    private int health;
    private String typeofprotection;

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getTypeofprotection() {
        return typeofprotection;
    }

    public void setTypeofprotection(String typeofprotection) {
        this.typeofprotection = typeofprotection;
    }
}