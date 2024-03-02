package com.yehor.lessons.homework15;

import com.yehor.lessons.homework18.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    private Wolf wolf = new Wolf("Wolf", 7);

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shoot using a bow to " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy){
            System.out.println(name + " and " + Archer.this.getName() + " hit the enemy..");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }
}

