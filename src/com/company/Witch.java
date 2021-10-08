package com.company;

public class Witch extends MythicalCreatures implements Printable{
    private String type;

    public Witch(String name, String superAbility, String type) {
        super(name, superAbility);
        this.type = type;
    }

    @Override
    public void print() {
        System.out.println("--------------------");
        System.out.println("Name: "+getName());
        System.out.println("Super Ability: "+getSuperAbility());
        System.out.println("Type: "+type);
    }
}
