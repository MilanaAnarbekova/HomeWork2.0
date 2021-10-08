package com.company;

public class Werewolf extends MythicalCreatures implements Printable {
private String color;

    public Werewolf(String name, String superAbility, String color) {
        super(name, superAbility);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("--------------------");
        System.out.println("Name: "+getName());
        System.out.println("Super Ability: "+getSuperAbility());
        System.out.println("Color: "+color);
        System.out.println("--------------------");
    }
}
