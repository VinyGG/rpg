package br.com.viny.rpg.main;

import java.util.Random;

public class Skills {

    Random rd = new Random();
    Fight fight = new Fight();

    public void doubleAttack(Player p1, Player p2) {
        System.out.println("| " + p1.getName() + " usa Double Attack: ");
        fight.attack(p1, p2);
        fight.attack(p1, p2);
    }

    public void totalForce(Player p1, Player p2) {
        System.out.println("| " + p1.getName() + " usa Total Force: ");
        double attack = (p1.getAttack() * 2);
        double attackTemp = p1.getAttackBase();
        p1.setAttackBonus((int) (attack - p1.getAttackBase()));
        fight.attack(p1, p2);
        p1.setAttackBonus((int) attackTemp);
        p1.setAttack();
    }

    public void shieldBlow(Player p1, Player p2) {
        System.out.println("| " + p1.getName() + " usa Shield Blow: ");
        double armorTemp = p1.getArmor();
        fight.turn(p1, p2);
        p1.setArmor(p1.getArmor() * 2);
        fight.turn(p2, p1);
        p1.setArmor(armorTemp);
    }

    public void fury(Player p1, Player p2) {
        System.out.println("| " + p1.getName() + " usa Fury: ");
        double num = rd.nextInt(100) + 251;
        num = num * 0.01;
        double attack = (p1.getAttack() * num);
        double attackTemp = p1.getAttackBonus();
        p1.setAttackBonus((int) (attack - p1.getAttackBase()));
        fight.attack(p1, p2);
        p1.setAttackBonus((int) attackTemp);
        p1.setAttack();
    }

    public void massacre(Player p1, Player p2) {
        double num = rd.nextInt(3) + 3;
        for (int i = 0; i < num; i++) {
            fight.attack(p1, p2);
        }
    }
}
