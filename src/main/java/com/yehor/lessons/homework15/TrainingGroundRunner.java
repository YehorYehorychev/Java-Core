package com.yehor.lessons.homework15;

public class TrainingGroundRunner {

    public static void main(String[] args) {

        Hero warrior = new Warrior("Gerald", 15);
        Hero mage = new Mage("Salazar", 20);
        Archer archer = new Archer("Vezemir", 10);
        Enemy enemy = new Enemy("Magistre", 100);

        archer.new Wolf ("Second Wolf", 11);

        attackEnemy(enemy,warrior,mage,archer);

    }

    public static void attackEnemy(Enemy enemy, Hero... heroes){
        while (enemy.isAlive()){
            for (Hero hero: heroes) {
                if (enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                    System.out.println();
                }
            }
        }
    }
}

