package com.company.game;

import com.company.players.*;


public class RPGgame {

    public static int roundCounter=1;



    private static void printStatistics(Hero heroes[], Boss boss){
        System.out.println("---------------------------");
        System.out.println("boss health: " + boss.getHealth());
        for(Hero hero: heroes){
            System.out.println("Hero " + hero.getClass().getSimpleName()
                    + " current health: " + hero.getHealth());
        }
        System.out.println("---------------------------");
    }
    private static void heroesHits(Hero heroes[], Boss boss){
        for(Hero hero : heroes){
            if(boss.getHealth() > 0 && hero.getHealth() > 0) {
                boss.setHealth(boss.getHealth()- hero.getDamage());
            }
        }
    }

    private static void bossHits(Hero heroes[], Boss boss){
        for(Hero hero : heroes){
            if(hero.getHealth()>0){
                hero.setHealth(hero.getHealth()- boss.getDamage());

            }
        }

    }

    private static boolean isFinish(Hero heroes[], Boss boss){
        if (boss.getHealth() <= 0){
            System.out.println("Heroes won");
            return true;
        }

        boolean allHeroesDead= true;
        for(Hero hero: heroes){
            if (hero.getHealth()>0){
                allHeroesDead = false;
                break;
            }
        }
        if(allHeroesDead){
            System.out.println("Boss won");
        }
        return allHeroesDead;
    }

    private static void applySuper(Hero heroes[], Boss boss){
        for(Hero hero : heroes)
        {
            if(hero.getHealth()>0){
                hero.applySuperAbility(heroes, boss);
            }

        }
    }

    private static void round(Hero heroes[], Boss boss){
        if(boss.getHealth()>0 ){
            bossHits(heroes,boss);
        }
        heroesHits(heroes,boss);
        applySuper(heroes,boss);
        printStatistics(heroes,boss);
    }

    public static void startGame() {
        Boss boss = new Boss(700, 50);
        Hunter hunter = new Hunter(240,20);
        Magical magic = new Magical(250,20);
        Medic medic = new Medic(240,0);
        Warrior warrior = new Warrior(230, 0);
        Hero heroes[] = {hunter,magic,warrior,medic};
        printStatistics(heroes, boss);
        while(!isFinish(heroes,boss))
        {
            roundCounter++;
            round(heroes,boss);
        }

        while (!isFinish(heroes, boss)) {
            round(heroes, boss);

        }
    }

}

