package com.company;

public class GameEntity {
    private int health;
    private int damage;

    public GameEntity(int health, int damage, String weapon) {
        this.health = health;
        this.damage = damage;
    }

    public GameEntity(){}

     public void getBossInfo(){
         System.out.print("Boss health is " + health + ". Boss damage is " + damage + ".");
     }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
