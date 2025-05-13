package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson {

    private String evilPlan;

    public SuperVillain(String name, int health,int strength , String evilPlan ){
        super(name, health);
        this.experiencePoints =strength;
        this.evilPlan = evilPlan;
        System.out.println(this.name + " has arrived with strength " + strength);
    }
    @Override
    public void fight (SuperPerson opponent){
        int damage =new Random().nextInt(21);
        int bonus = getPowerBones();
        int total= this.experiencePoints + bonus;

        System.out.println(this.name + " attacks " + opponent.name);
        logHit(opponent);


        if (damage !=0){
            opponent.takeDamage(total);
        }


    }
    public void useRage(){
        experiencePoints +=10;
        System.out.println(name + " use Rage! power +10" );
    }
    public void useHeal() {

        this.health += 20;  //heal by 20 health points.
        if (this.health > 100) {  //ensure health doesn't exceed 100
            this.health = 100;
        }
        System.out.println(this.name + " heals themselves for 20 health! ");

    }

}
