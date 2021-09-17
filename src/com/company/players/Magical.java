package com.company.players;

import java.util.Random;

public class Magical extends Hero{
    public Magical(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if (isAbilityAvailable ==1) {
            for (int i = 0; i < heroes.length ; i++) {
                if (!heroes[i].getClass().getSimpleName().equals("Magical")){
                    int randomHero = new Random().nextInt(heroes.length-1);
                    int randAdditionalDamage = new Random().nextInt(21);
                    heroes[randomHero].setDamage(heroes[randomHero].getDamage() +randAdditionalDamage);
                    System.out.println("Magical boosted hero "+ heroes[randomHero].getClass().getSimpleName()+"by" + randAdditionalDamage);
                break;
                }
                }

            }  else {
            System.out.println("Magical loosed his super ability ");
        }
    }
}
