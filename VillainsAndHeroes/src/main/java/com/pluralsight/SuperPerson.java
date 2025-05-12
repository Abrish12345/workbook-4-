package com.pluralsight;

import java.util.Random;

public class SuperPerson {

    //protected properties so they can possibly be access by our children
    protected String name;
    protected int health;
    protected int experiencePoints;

    public SuperPerson(String name, int health) {
        this.name = name;
        this.health = health;

        //default the experience points to 0
        this.experiencePoints=0;

    }
    public boolean isAlive(){
        //if the health is greater than zero, return true, otherwise return false
        return this.health >0;

    }
    public void fight(SuperPerson opponent){
        //generate a random amount of damage
        //line returns a number between 0 and 20
        int damageAmount= new Random().nextInt(21);
        //print out who we are fighting
        System.out.println(this.name + " is fighting " + opponent.name);
    }
    //this methods allows a super person to take damage

    public void takeDamage(int damageAmount){
      //subtract the damage amount from the health
        //but we dont want ever set our health below 0
        this.health -=damageAmount;
        if(this.health <0){
            this.health =0;
        }
    }

    //a way to ask the super person how they are doing.
    public String getStatus(){
        return this.name + "has " + this.health + " health left! ";
    }
}
