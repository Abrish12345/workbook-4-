package com.pluralsight;

import java.util.Random;

//CREATE A CLASS USING THE EXTENDS KEYWORD TO BASICALLY
public class SuperHero extends SuperPerson {
    public SuperHero(String name, int health, int powerLevel) {
        super(name, health);

        //in the parent we default power level (XP) to 0
        //for our superhero we want to have them pass in power level
        //but just use as xp
        this.experiencePoints = powerLevel;

        //print out the hero
        System.out.println(this.name + "has arrived with a power of " + powerLevel);

    }

    @Override
    public void fight(SuperPerson opponent){

        //make the hero do a random amount of damage to the opponenet
        int damageAmount = new Random().nextInt(21);

        //the damage should be a random numnber plus the experiencesPoints(powerLevel)
        int totalDamage = damageAmount + this.experiencePoints;

        //if the base damage (without the xp) was 0, don't do any damage and just say you missed

        if (damageAmount ==0){
            System.out.println(this.name + "missed the attack!");
        }else {
            //otherwise deal the damage and say something about you kicking butt agains your opponent
             opponent.takeDamage(totalDamage);
             System.out.println(this.name + "kick butt and deals" + totalDamage + "damage to" + opponent.name);
             System.out.println(opponent.name + "now has " + opponent.health + "health");
        }
    }

}