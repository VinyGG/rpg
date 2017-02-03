package br.com.viny.rpg.main;

public class Player {

    private String name;
    private int hitpoint;
    private int attack;
    private int attackInterval;
    private double armor;
    private double blockBonus;

    public Player(String name, int hitpoint, int attack, double armor, double blockBonus) {
        this.name = name;
        this.hitpoint = hitpoint;
        this.attack = attack;
        this.attackInterval = (int) (attack * 0.5);
        this.armor = armor;
        this.blockBonus = blockBonus;
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

    public double getBlockBonus() {
        return blockBonus;
    }

    public void setBlockBonus(int blockBonus) {
        this.blockBonus = blockBonus;
    }

}
