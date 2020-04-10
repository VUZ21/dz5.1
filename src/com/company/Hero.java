package com.company;

public class Hero {
    double damage;// урон
    int health;
    String superpowers;

    public Hero(int health, double dam, String superpowers) {
        this.health = health;
        damage = dam;
        this.superpowers = superpowers;
    }

    public Hero(int health, double dam) {
        this.health = health;
        damage = dam;
    }

    public double getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperpowers() {
        return superpowers;
    }
}
