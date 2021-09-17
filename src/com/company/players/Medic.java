package com.company.players;

import java.util.Random;

public class Medic extends  Hero{
    public Medic(int health, int damage) {
        super(health, damage, SuperAbility.HEAL);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if (isAbilityAvailable ==1) {
            for (Hero hero: heroes){
                if (this != hero && hero.getHealth()>0){
                    int randomHeal = new Random().nextInt(15);
                    hero.setHealth(hero.getHealth()+ randomHeal);
                    System.out.println("medic heales hero "+ hero.getClass().getSimpleName()+ "by "+ randomHeal);
                    break;

                }
                }
            } else {
            System.out.println("medic did not heal");
        }

    }
}
