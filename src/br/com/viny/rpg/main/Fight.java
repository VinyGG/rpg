package br.com.viny.rpg.main;

import java.util.Random;

public class Fight {

    Random rd = new Random();

    public void attack(Player p1, Player p2) {

        double hitVar = rd.nextInt((int) p1.getAttackInterval()) + (p1.getAttack() - (p1.getAttackInterval() / 2));
        p2.setReducedPercent();
        double hitReduced = (hitVar * (p2.getReducedPDecimal()));
        double hit = (hitVar - hitReduced);
        boolean criticalVerify = false;

        if (criticalChance(p1.getCriticalPercent())) {
            criticalVerify = true;
            hit = hit + (hit * (p1.getCriticalADecimal()));
        }
        if (hit <= 0) {
            hit = 0;
        }
        hit = (int) hit;
        showInfoTurn(p1, p2, hitReduced, hitVar, (int) hit);
        if (blockChance(p2.getBlockPDecimal(), p1.getAccuracyPDecimal())) {
            System.out.println("| ATAQUE BLOQUEADO: " + p2.getName() + " conseguiu bloquear o ataque de " + hit + " de " + p1.getName());
        } else {
            p2.setHitpoint((int) (p2.getHitpoint() - hit));
            if (criticalVerify == true) {
                System.out.println("| DANO CAUSADO: " + p1.getName() + "(" + p1.getHitpoint() + ")" + " causou " + hit + " de dano em " + p2.getName() + " com um golpe CRÍTICO, o deixando com " + p2.getHitpoint() + " de vida.");
            } else {
                System.out.println("| DANO CAUSADO: " + p1.getName() + "(" + p1.getHitpoint() + ")" + " causou " + hit + " de dano em " + p2.getName() + ", o deixando com " + p2.getHitpoint() + " de vida.");
            }
        }
    }

    public void turn(Player p1, Player p2) {
        attack(p1, p2);
    }

    public boolean blockChance(double blockPDecimal, double accuracyPDecimal) {
        double num = rd.nextInt(100) + 1;
        System.out.println("| BLOCK NUMBER RANDOM: " + num);
        System.out.println("| BLOCK PERCENT: " + blockPDecimal);
        blockPDecimal = 100 * (blockPDecimal * accuracyPDecimal);
        System.out.println("| ACCURACY PERCENT: " + accuracyPDecimal);
        if (num <= blockPDecimal) {
            return true;
        } else {
            return false;
        }
    }

    public boolean criticalChance(double criticalPercent) {
        double num = rd.nextInt(100) + 1;
        System.out.println("| CRITICAL NUMBER RANDOM: " + num);
        if (num <= criticalPercent) {
            return true;
        } else {
            return false;
        }
    }

    public void Battle(Player p1, Player p2) {
        int turn = 1;
        showInfoBattle(p1, p2);
        do {
            System.out.println("\n ---- " + turn + "º TURNO ----");
            attack(p1, p2);
            turn++;
            if (p2.getHitpoint() <= 0) {
                break;
            }
            System.out.println("\n ---- " + turn + "º TURNO ----");
            attack(p2, p1);
            turn++;
        } while (p1.getHitpoint() > 0 && p2.getHitpoint() > 0);
        System.out.println(" ---- FINAL DA BATALHA ----");
        if (p1.getHitpoint() > 0) {
            p2.setHitpoint(0);
            System.out.println("  ==> " + p1.getName() + " GANHOU A BATALHA!");
        } else {
            p1.setHitpoint(0);
            System.out.println("  ==> " + p2.getName() + " GANHOU A BATALHA!");
        }
        System.out.println(p1.getName() + " HP = " + p1.getHitpoint());
        System.out.println(p2.getName() + " HP = " + p2.getHitpoint());
        System.out.println();
    }

    public void showInfoBattle(Player p1, Player p2) {
        System.out.println("  --------- BATALHA --------->  " + p1.getName() + " X " + p2.getName() + "  <--------- BATALHA --------- ");
        System.out.println("| ");
        System.out.println("|  " + p1.getName() + " ---");
        System.out.println("|  | VIDA: " + (int) p1.getHitpoint() + " - ARMOR: " + (int) p1.getArmor() + " - ATAQUE: " + (int) p1.getAttack() + " - VARIAÇÃO DE ATAQUE: " + (int) p1.getAttackInterval() + "%");
        System.out.println("|  | BLOQUEIO -> BLOCK BASE: " + (int) p1.getBlockBase() + " - BLOCK BONUS: " + (int) p1.getBlockBonus() + " - BLOCK PERCENT: " + (int) p1.getBlockPercent() + "%");
        System.out.println("|  | REDUÇÃO  -> RECUDED BASE: " + (int) p1.getReducedBase() + " - REDUCED BONUS (ARMOR): " + (int) p1.getArmor() + " - RECUDED PERCENT: " + (int) p1.getReducedPercent() + "%");
        System.out.println("|  | CRÍTICO  -> CRITICAL BASE: " + (int) p1.getCriticalBase() + " - CRITICAL BONUS: " + (int) p1.getCriticalBonus() + " - CRITICAL AMOUNT: " + (int) p1.getCriticalAmount() + " - CRITICAL CHANCE: " + (int) p1.getCriticalPercent() + "%");
        System.out.println("|  | ACCURACY -> ACCURACY BASE: " + (int) p1.getAccuracyBase() + " - ACCURACY BONUS: " + (int) p1.getAccuracyBonus() + " - ACCURACY PERCENT: " + (int) p1.getAccuracyPercent() + "%");
        System.out.println("|");
        System.out.println("|  " + p2.getName() + " ---");
        System.out.println("|  | VIDA: " + (int) p2.getHitpoint() + " - ARMOR: " + (int) p2.getArmor() + " - ATAQUE: " + (int) p2.getAttack() + " - VARIAÇÃO DE ATAQUE: " + (int) p2.getAttackInterval() + "%");
        System.out.println("|  | BLOQUEIO -> BLOCK BASE: " + (int) p2.getBlockBase() + " - BLOCK BONUS: " + (int) p2.getBlockBonus() + " - BLOCK PERCENT: " + (int) p2.getBlockPercent() + "%");
        System.out.println("|  | REDUÇÃO  -> RECUDED BASE: " + (int) p2.getReducedBase() + " - REDUCED BONUS (ARMOR): " + (int) p2.getArmor() + " - RECUDED PERCENT: " + (int) p2.getReducedPercent() + "%");
        System.out.println("|  | CRÍTICO  -> CRITICAL BASE: " + (int) p2.getCriticalBase() + " - CRITICAL BONUS: " + (int) p2.getCriticalBonus() + " - CRITICAL AMOUNT: " + (int) p2.getCriticalAmount() + " - CRITICAL CHANCE: " + (int) p2.getCriticalPercent() + "%");
        System.out.println("|  | ACCURACY -> ACCURACY BASE: " + (int) p2.getAccuracyBase() + " - ACCURACY BONUS: " + (int) p2.getAccuracyBonus() + " - ACCURACY PERCENT: " + (int) p2.getAccuracyPercent() + "%");
        System.out.println("|");
        System.out.println(" -------------------------------------------------------------------------");
    }

    public void showInfoTurn(Player p1, Player p2, double hitReduced, double hitVar, int hit) {
        System.out.println("|  --- " + p1.getName() + " ATACANDO ---");
        System.out.println("| | HIT TOTAL: " + hitVar);
        System.out.println("|  --- " + p2.getName() + " DEFENDENDO ---");
        System.out.println("| | HIT REDUZIDO: " + hitReduced);
        System.out.println("| | -> HIT: " + hit);
    }

}
