package com.yehor.lessons.homework15;

import com.yehor.lessons.homework18.weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon>  extends Hero<T> {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " hitting using a sward " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
