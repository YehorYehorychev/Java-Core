package com.yehor.lessons.homework15;

import com.yehor.lessons.homework18.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon>  extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " spelling a magic to " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
