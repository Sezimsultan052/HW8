package com.company.players;

import java.util.Random;

public class Thor extends Hero{
    public Thor(int health, int damage) {
        super(health, damage,SuperAbility.DEAFEN);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if (isAbilityAvailable ==1) {

        }
    }
}
