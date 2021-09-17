package com.company.players;

public class Tank extends Hero{
    public Tank(int health, int damage) {
        super(health, damage, SuperAbility.TANKABILITY);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {

    }
}
