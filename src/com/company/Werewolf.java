package com.company;

public class Werewolf extends MythicalCreatures implements Printable {
private String color;

    public Werewolf(String name, String superAbility, String color) {
        super(name, superAbility);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getSuperAbility());
        System.out.println(color);
    }
}
