package exercise3;

/*
* Write a Java class that implements a set of three overloaded static methods.
* The methods should have different set of parameters and perform similar functionalities.
* Call the methods within main method and display the results.
 */

import javax.swing.*;

public class OverloadingTest {
    public static void main(String[] args) {
        //calling useSkill inside showMessageDialog
        JOptionPane.showMessageDialog(null,
                useSkill("Abaddon", "Aphotic Shield"));
        JOptionPane.showMessageDialog(null,
                useSkill("Sniper", "Assassinate", 650, "Phantom Assassin"));
        JOptionPane.showMessageDialog(null,
                useSkill("Mirana", "Starstorm", 300));
    }

    //area damage
    public static String useSkill(String hero, String skill, int damage){
        return String.format("%s used %s and dealt %d area damage!",
                hero, skill, damage);
    }

    //targeted damage
    public static String useSkill(String hero, String skill, int damage, String enemy){
        return String.format("%s hit %s with %s and dealt %d damage",
                hero, enemy, skill, damage);
    }

    //use skill on itself (buff)
    public static String useSkill(String hero, String skill){
        return String.format("%s used %s on itself",
                hero, skill);
    }
}
