package com.company;

public class Main {

    public static void main(String[] args) {
        Boss b = new Boss();
        b.setDamage (3.2);
        b.setHealth(5);
        b.setTypeofprotection ("encodes");

            System.out.println(b.getDamage() +  "  " +  b.getHealth()  +  "  " +  b.getTypeofprotection());
    }
}
