package com.yehor.lessons.homework18;

import com.yehor.lessons.homework15.Archer;
import com.yehor.lessons.homework15.Hero;
import com.yehor.lessons.homework15.Warrior;
import com.yehor.lessons.homework18.weapon.Bow;
import com.yehor.lessons.homework18.weapon.Sword;
import com.yehor.lessons.homework18.weapon.Weapon;

public class WeaponRunner {

    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Wolf", 15);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Gerald", 10);
        warrior.setWeapon(new Sword());
        printWeaponDamage(archer);

    }
    public static<T extends Weapon> void printWeaponDamage(Hero<? extends Weapon> hero) {
        System.out.println(hero.getWeapon().getDamage());
    }
}
