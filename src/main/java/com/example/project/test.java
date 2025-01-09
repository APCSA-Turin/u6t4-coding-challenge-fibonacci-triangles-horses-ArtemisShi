package com.example.project;

public class test {
 public static void main(String[] args) {
    HorseBarn barn1 = new HorseBarn(6);
    Horse Trigger = new Horse("Trigger", 1340);
    Horse Silver = new Horse("Silver",1210) ;
    Horse Lucy = new Horse("Lucy",1500);
    Horse Cotton = new Horse("Cotton", 1555);
    barn1.placeHorse(Trigger, 0);
    barn1.placeHorse(Silver, 1);
    barn1.placeHorse(Lucy, 4);
    barn1.placeHorse(Cotton, 5);
    barn1.consolidate();
    System.out.println(barn1.horseBarnInfo());
 }
}
