package br.com.viny.rpg.main;

import java.util.Scanner;
import java.util.Random;

public class Start {

    public static void main(String[] args) {
        Random num = new Random();
        Scanner in = new Scanner(System.in);
        Luta luta = new Luta();
        Player p1 = new Player("Bjorn", 300, 15, 0, 0);
        Player p2 = new Player("Floki", 300, 15, 3, 5);
        Player p3 = new Player("Rarnar", 300, 15, 0, 0);
        Player p4 = new Player("Lagertha", 300, 15, 0, 0);
        Player p5 = new Player("Ivar", 300, 15, 0, 0);
        Player p6 = new Player("Rollo", 300, 15, 0, 0);

        luta.Battle(p1, p2);

    }
}
