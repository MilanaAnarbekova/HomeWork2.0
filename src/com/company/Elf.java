package com.company;

class Elf extends MythicalCreatures implements Printable {
    private String temper ;

    public Elf(String name, String superAbility, String temper) {
        super(name, superAbility);
        this.temper = temper;
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getSuperAbility());
        System.out.println(temper);



    }

}
