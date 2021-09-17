package com.company.players;

import java.util.Random;

public class Warrior extends Hero{
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(4);
        if (isAbilityAvailable ==1) {
            int bossDamage = boss.getDamage();
            boss.setHealth((boss.getHealth()- bossDamage));
            System.out.println("boss reverted boss damage by "+ bossDamage);

        }
        else if(isAbilityAvailable == 2 ) {
            int randomDamage = 15;
            boss.setHealth((boss.getHealth()- randomDamage));
            System.out.println("warrior use critical damage * "+ randomDamage);


        }
        else if(isAbilityAvailable == 3){
            int randomDamage = 30;
            boss.setHealth((boss.getHealth()- randomDamage));
            System.out.println("warrior use critical damage *  "+ randomDamage);

        }
        else if(isAbilityAvailable == 4){
            int randomDamage = 45;
            boss.setHealth((boss.getHealth()- randomDamage));
            System.out.println("warrior use critical damage *  "+ randomDamage);

        } else {
            System.out.println("warrior loosed his super ability");
        }
    }
}
