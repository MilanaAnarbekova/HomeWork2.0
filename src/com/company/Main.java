package com.company;

public class Main {

    public static void main(String[] args) {

        MythicalCreatures[] arrayMythicalCreatures = {createObject("Witch"),
                createObject("Elf"), createObject("Werewolf")};

        for (MythicalCreatures a : arrayMythicalCreatures) {
            a.print();

        }

    }

    public static MythicalCreatures createObject(String className) {
        switch (className){
            case "Elf":
                Elf milana = new Elf("Sofia ","teleport","bad");
                return milana;
            case "Witch":
                Witch flora= new Witch("Flora","plants","forest");
                return flora;
            case "Werewolf":
                Werewolf clod = new Werewolf("Clod","werewolf","brown");
                return clod;
        }
        return null;
    }
}
