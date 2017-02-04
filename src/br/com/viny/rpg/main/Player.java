package br.com.viny.rpg.main;

public class Player {

    private String name;
    private int hitpoint;
    private int attack;
    private int attackInterval;
    private double armor;

    //Damage
    private double blockBase;
    private double blockBonus;
    private double blockPercent;
    private double reducedBase;
    private double reducedPercent;

    public Player(String name, int hitpoint, int attack) {
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.attackInterval = (int) (attack * 0.5);
        this.armor = armor;
        this.blockBase = 15;
        this.blockBonus = 0;
        this.blockPercent = this.blockBase + this.blockBonus;
        this.reducedBase = 0;
        this.reducedPercent = this.reducedBase + this.armor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHitpoint() {
        return hitpoint;
    }

    public void setHitpoint(int hitpoint) {
        this.hitpoint = hitpoint;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getAttackInterval() {
        return attackInterval;
    }

    public void setAttackInterval(int attackInterval) {
        this.attackInterval = attackInterval;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getBlockBase() {
        return blockBase;
    }

    public void setBlockBase(double blockBase) {
        this.blockBase = blockBase;
    }

    public double getBlockBonus() {
        return blockBonus;
    }

    public void setBlockBonus(double blockBonus) {
        this.blockBonus = blockBonus;
    }

    public double getBlockPercent() {
        return blockPercent;
    }

    public void setBlockPercent(double blockBonus) {
        this.blockPercent = this.blockBase + blockBonus;
    }

    public double getReducedPercent() {
        return reducedPercent;
    }

    public void setReducedPercent() {
        double reduced = this.reducedBase + this.armor;
        if ((this.reducedBase + this.armor) > 50) {
            reduced = 50;
        }
        this.reducedPercent = 0.01 * reduced;
    }

    public double getReducedBase() {
        return reducedBase;
    }

    public void setReducedBase(double reducedBase) {
        this.reducedBase = reducedBase;
    }

}
