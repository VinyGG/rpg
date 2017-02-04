package br.com.viny.rpg.main;

import java.util.Scanner;
import java.util.Random;

public class Start {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner in = new Scanner(System.in);
        Luta luta = new Luta();
        Player p1 = new Player("Bjorn", 1000, 150);
        p1.setArmor(5);
        p1.setBlockBonus(3);
        Player p2 = new Player("Floki", 1000, 150);

        luta.Battle(p1, p2);

    }
}
