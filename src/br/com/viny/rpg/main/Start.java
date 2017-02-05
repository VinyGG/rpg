package br.com.viny.rpg.main;

import java.util.Scanner;
import java.util.Random;

public class Start {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner in = new Scanner(System.in);
        Fight luta = new Fight();

        Player p1 = new Player("Bjorn");
        p1.setAttackBonus(20);
        p1.setArmor(5);
        p1.setBlockBonus(3);
        p1.setCriticalBonus(5);
        p1.setAccuracyBonus(4);

        Player p2 = new Player("Floki");
        p2.setAttackBonus(10);
        p2.setArmor(7);
        p2.setBlockBonus(1);
        p2.setCriticalBonus(10);
        p2.setAccuracyBonus(6);

        luta.Battle(p1, p2);

    }
}
