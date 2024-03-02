package com.yehor.lessons.homework15;

public class Enemy implements Mortal {

    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void takeDamage(int damage){
        if (isAlive() && health <= damage){
            health = 0;
            System.out.println(getName() + " is dead!");
        } else {
        this.health -= Math.min(health, damage);
        System.out.println(name + " got damage " + damage + ". Now he has " + health + " hp..");
        }
    }

    @Override
    public boolean isAlive() {
        return health > 0;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

}
