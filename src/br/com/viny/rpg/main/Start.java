package br.com.viny.rpg.main;

import br.com.viny.rpg.skills.*;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;

import br.com.viny.rpg.skills.*;

public class Start {

    public static void main(String[] args) {

        DoubleAttack doubleAttack;

        Scanner in = new Scanner(System.in);

        Random num = new Random();
        Fight fight = new Fight();
        Skills skills = new Skills();

        Player p1 = new Player("Bjorn");
        p1.setAttackBonus(15);
        p1.setArmor(6);
        p1.setBlockBonus(3);
        p1.setCriticalBonus(5);
        p1.setAccuracyBonus(1);

        Player p2 = new Player("Floki");
        p2.setAttackBonus(20);
        p2.setArmor(7);
        p2.setBlockBonus(3);
        p2.setCriticalBonus(10);
        p2.setAccuracyBonus(6);

        fight.Battle(p1, p2);

        doubleAttack = new DoubleAttack();

        System.out.println("");
        skills.doubleAttack(p1, p2);
        System.out.println("");
        skills.totalForce(p1, p2);
        System.out.println("");
        skills.shieldBlow(p1, p2);
        System.out.println("");
        skills.fury(p1, p2);
    }
}
