package br.com.viny.rpg.main;

import java.util.Random;

public class Luta {

    Random rd = new Random();

    public void Attack(Player p1, Player p2) {

        double hitVar = rd.nextInt(p1.getAttackInterval()) + (p1.getAttack() - (p1.getAttackInterval() / 2));
        p2.setReducedPercent();
        double hitReduced = (hitVar * p2.getReducedPercent());
        double hit = (hitVar - hitReduced);
        double criticalA;

        if (criticalChance(p1.getCriticalPercent())) {
            boolean critical = true;
            System.out.println("| CRITICAL!");
            hit = hit + (hit * (0.01 * p1.getCriticalAmount()));
        }
        if (hit <= 0) {
            hit = 0;
        }
        hit = (int) hit;
        System.out.println("| ATTACK: " + p1.getAttack() + " | ARMOR: " + p2.getArmor() + " | HitVar " + hitVar + " | CRITICAL BONUS: " + p1.getCriticalAmount() + " | HitReduced: " + hitReduced + " | ReducedPercent: " + p2.getReducedPercent() + " | BlockPercent: " + p2.getBlockPercent());
        System.out.println("| HIT: " + hit);
        if (blockChance(p2.getBlockPercent())) {
            System.out.println("| BLOQUEIO: " + p2.getName() + " conseguiu bloquear o ataque de " + hit + " de " + p1.getName());
        } else {
            p2.setHitpoint((int) (p2.getHitpoint() - hit));
            System.out.println("| SUCESSO : " + p1.getName() + "(" + p1.getHitpoint() + ")" + " causou " + hit + " de dano em " + p2.getName() + ", o deixando com " + p2.getHitpoint() + " de vida.");

        }
    }

    public boolean blockChance(double BlockPercent) {
        double num = rd.nextInt(99) + 1;
        //System.out.println("BLOCK NUMBER: " + num);
        if (num <= BlockPercent) {
            return true;
        } else {
            return false;
        }
    }

    public boolean criticalChance(double criticalPercent) {
        double num = rd.nextInt(99) + 1;
        //System.out.println("BLOCK NUMBER: " + num);
        if (num <= criticalPercent) {
            return true;
        } else {
            return false;
        }
    }

    public void Battle(Player p1, Player p2) {
        int turn = 1;
        System.out.println("| BATALHA -> " + p1.getName() + " X " + p2.getName() + " <- |");
        System.out.println("| " + p1.getName() + " => VIDA: " + p1.getHitpoint() + ", ARMOR: " + p1.getArmor() + ", BLOCK BASE: " + p1.getBlockBase() + ", BLOCK PERCENT: " + p1.getBlockPercent());
        System.out.println("| " + p2.getName() + " => VIDA: " + p2.getHitpoint() + ", ARMOR: " + p2.getArmor() + ", BLOCK BASE: " + p2.getBlockBase() + ", BLOCK PERCENT: " + p2.getBlockPercent());
        do {
            System.out.println("---- " + turn + "º TURNO ----");
            Attack(p1, p2);
            turn++;
            if (p2.getHitpoint() <= 0) {
                break;
            }
            System.out.println("---- " + turn + "º TURNO ----");
            Attack(p2, p1);
            turn++;
        } while (p1.getHitpoint() > 0 && p2.getHitpoint() > 0);
        System.out.println("---- FINAL DA BATALHA ----");
        if (p1.getHitpoint() > 0) {
            p2.setHitpoint(0);
            System.out.println(" ==> " + p1.getName() + " GANHOU A BATALHA!");
        } else {
            p1.setHitpoint(0);
            System.out.println(" ==> " + p2.getName() + " GANHOU A BATALHA!");
        }
        System.out.println(p1.getName() + " HP = " + p1.getHitpoint());
        System.out.println(p2.getName() + " HP = " + p2.getHitpoint());
        System.out.println();
    }
}
