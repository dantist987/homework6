package com.company;

public class Boss extends GameEntity{
    public Boss() {
    }

    public Boss(int health, int damage, String weapon) {
        super(health, damage, weapon);
    }

    @Override
    public void getBossInfo() {
        super.getBossInfo();
        System.out.println(" Used Hammer.");
    }
}
