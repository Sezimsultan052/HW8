package com.company.players;

import java.util.Random;

public class Hunter extends Hero{
    public Hunter(int health, int damage) {
        super(health, damage,SuperAbility.CRITICAL_DAMAGE );
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if (isAbilityAvailable ==1){
            int randDamage = new Random().nextInt(21);
            boss.setDamage(boss.getDamage()- randDamage);
            System.out.println("Hunter decrease boss damage by" + randDamage);

        } else {
            System.out.println("Hunter is loosed his super ability");
        }
    }
}
