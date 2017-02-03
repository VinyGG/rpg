package br.com.viny.rpg.main;

import java.util.Random;

public class Luta {

    Random rd = new Random();
    int hit;
    double globalBlock = 15;
    int globalArmor = 10;

    public void Attack(Player p1, Player p2) {
        hit = rd.nextInt(p1.getAttackInterval()) + (p1.getAttack() - (p1.getAttackInterval() / 2));
        System.out.println("ATTACK: " + p1.getAttack() + " | ARMOR: " + p2.getArmor());
        hit = (int) (hit * (0.1 * (globalArmor + p2.getArmor())));
        System.out.println("HIT: " + hit);
        if (blockChance(p2.getBlockBonus())) {
            System.out.println("BLOQUEIO: " + p2.getName() + " conseguiu bloquear o ataque de " + hit + " de " + p1.getName());
        } else {
            p2.setHitpoint(p2.getHitpoint() - hit);
            System.out.println("SUCESSO : " + p1.getName() + "(" + p1.getHitpoint() + ")" + " causou " + hit + " de dano em " + p2.getName() + ", o deixando com " + p2.getHitpoint() + " de vida.");

        }
    }

    public boolean blockChance(double blockBonus) {
        double num = rd.nextInt(99) + 1;
        //System.out.println("BLOCK NUMBER: " + num);
        if (num <= (globalBlock + blockBonus)) {
            return true;
        } else {
            return false;
        }
    }

    public void Battle(Player p1, Player p2) {
        System.out.println("| BATALHA -> " + p1.getName() + " X " + p2.getName() + " <- |");
        do {
            Attack(p1, p2);
            if (p2.getHitpoint() <= 0) {
                break;
            }
            Attack(p2, p1);
        } while (p1.getHitpoint() > 0 && p2.getHitpoint() > 0);
        if (p1.getHitpoint() > 0) {
            System.out.println(p1.getName() + " GANHOU A BATALHA!");
        } else {
            System.out.println(p2.getName() + " GANHOU A BATALHA!");
        }
        System.out.println(p1.getName() + " HP = " + p1.getHitpoint());
        System.out.println(p2.getName() + " HP = " + p2.getHitpoint());
        System.out.println();
    }
}
