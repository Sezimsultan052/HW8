package com.company.players;

import java.util.Random;

public class Witcher extends Hero{
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.WITCHER);
    }

    @Override
    public void applySuperAbility(Hero[] heroes, Boss boss) {
        int isAbilityAvailable = new Random().nextInt(2);
        if (isAbilityAvailable ==1) {
            for (Hero hero: heroes){
                if ((hero.getClass().getSimpleName()) == "Witcher" && hero.getHealth()>0){
                    int witcherLastHealth = hero.getHealth() - boss.getDamage();
                    hero.setHealth(witcherLastHealth);
                    System.out.println("witcher get damage by " + witcherLastHealth);
                    for (Hero hero1: heroes) {
                        if (hero1.getHealth() == 0) {
                            hero1.setHealth(witcherLastHealth);
                            System.out.println(hero1.getClass().getSimpleName() + "died ");
                            break;
                        }
                    }
                    break;

                }
            }
        } else {
            System.out.println("Hunter is loosed his super ability");
        }




        }
    }

