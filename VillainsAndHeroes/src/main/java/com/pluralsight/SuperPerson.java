package com.pluralsight;

import java.util.*;

public class SuperPerson {

    //protected properties so they can possibly be access by our children
    protected String name;
    protected int health;
    protected int experiencePoints;
    private HashMap<String, Integer> battleLog =new HashMap<>();
    private HashMap<String, Integer> inventory = new HashMap<>();


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
        logHit(opponent);
    }
    //This methods allows a super person to take damage

    public void takeDamage(int damageAmount){
      //subtract the damage amount from the health
        //But we don't want ever set our health below 0
        this.health -=damageAmount;
        if(this.health <0){
            this.health =0;
        }
    }

    //a way to ask the super person how they are doing.
    public String getStatus(){
        return this.name + "has " + this.health + " health left! ";
    }

    //Backlog
    public void logHit(SuperPerson opponent){
        String name=opponent.name;
        int count = battleLog.getOrDefault(name,0);
        battleLog.put(name,count + 1);
    }

    public void printBattleLog(){
        System.out.println("Battle Log for " + name + ":");
        for (HashMap.Entry<String, Integer> entry : battleLog.entrySet()) {
            System.out.println(" - Hit " + entry.getKey() + ": " + entry.getValue() + " times");
        }
    }
    public void addPowerUp(String spell, int value){
        inventory.put(spell, value);
    }
    public int getPowerBones(){
        if (!inventory.isEmpty()){
            List<String> keys =new ArrayList<>(inventory.keySet());

            String ranndomkey = keys.get(new Random().nextInt(keys.size()));

            int bones = inventory.get(ranndomkey);
            System.out.println(name + " uses power_up: " + ranndomkey + " (+" + bones + "damage)");
           return bones;

        }
        return 0;
    }


}
