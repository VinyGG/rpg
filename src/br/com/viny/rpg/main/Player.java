package br.com.viny.rpg.main;

public class Player {

    Settings settings = new Settings();

    private String name;
    private int hitpoint;

    private double attackBase;
    private double attackBonus;
    private double attack;
    private double attackInterval;

    private double accuracyBase;
    private double accuracyBonus;
    private double accuracyPercent;
    private double accuracyPDecimal;

    private double blockBase;
    private double blockBonus;
    private double blockPercent;
    private double blockPDecimal;

    private double reducedBase;
    private double armor;
    private double reducedPercent;
    private double reducedPDecimal;

    private double criticalBase;
    private double criticalBonus;
    private double criticalAmount;
    private double criticalPercent;
    private double criticalADecimal;

    public Player(String name) {
        this.name = name;
        this.hitpoint = settings.getHit_Point_Base();
        this.attackBase = settings.getAttack_Base();
        this.attackBonus = settings.getAttack_Bonus();
        this.attack = this.attackBonus + this.attackBase;
        this.attackInterval = (int) (attack * settings.getAttack_Interval_Percent());
        this.accuracyBase = settings.getAccuracy_Base();
        this.accuracyBonus = settings.getAccuracy_Bonus();
        this.accuracyPercent = settings.getAccuracy_Percent();
        this.criticalBase = settings.getCritical_Base();
        this.criticalBonus = settings.getCritical_Bonus();
        this.criticalAmount = settings.getCritical_Amout();
        this.criticalPercent = this.criticalBase + this.criticalBonus;
        this.blockBase = settings.getBlock_Base();
        this.blockBonus = settings.getBlock_Bonus();
        this.blockPercent = this.blockBase + this.blockBonus;
        this.reducedBase = settings.getReduced_Base();
        this.armor = settings.getArmor();
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

    public double getAttackBase() {
        return attackBase;
    }

    public void setAttackBase(int attackBase) {
        this.attackBase = attackBase;
    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
        setAttack();
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack() {
        this.attack = this.attackBonus + this.attackBase;
    }

    public double getAccuracyPDecimal() {
        setAccuracyPercent();
        accuracyPDecimal = accuracyPercent * 0.01;
        return accuracyPDecimal;
    }

    public void setAccuracyPDecimal(double accuracyPDecimal) {
        this.accuracyPDecimal = accuracyPDecimal;
    }

    public double getBlockPDecimal() {
        setBlockPercent();
        blockPDecimal = blockPercent * 0.01;
        return blockPDecimal;
    }

    public void setBlockPDecimal(double blockPDecimal) {
        this.blockPDecimal = blockPDecimal;
    }

    public double getReducedPDecimal() {
        setReducedPercent();
        reducedPDecimal = reducedPercent * 0.01;
        return reducedPDecimal;
    }

    public void setReducedPDecimal(double reducedPDecimal) {
        this.reducedPDecimal = reducedPDecimal;
    }

    public double getCriticalADecimal() {
        setCriticalPercent();
        criticalADecimal = criticalAmount * 0.01;
        return criticalADecimal;
    }

    public void setCriticalPDecimal(double criticalPDecimal) {
        this.criticalADecimal = criticalPDecimal;
    }

    public double getAttackInterval() {
        return attackInterval;
    }

    public void setAttackInterval(int attackInterval) {
        this.attackInterval = attackInterval;
    }

    public double getAccuracyBase() {
        return accuracyBase;
    }

    public void setAccuracyBase(double accuracyBase) {
        this.accuracyBase = accuracyBase;
    }

    public double getAccuracyBonus() {
        return accuracyBonus;
    }

    public void setAccuracyBonus(double accuracyBonus) {
        this.accuracyBonus = accuracyBonus;
        setAccuracyPercent();
    }

    public double getAccuracyPercent() {
        setAccuracyPercent();
        return accuracyPercent;
    }

    public void setAccuracyPercent() {
        this.accuracyPercent = this.accuracyBase + this.accuracyBonus;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
        setReducedPercent();
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
        setBlockPercent();
    }

    public double getBlockPercent() {
        return blockPercent;
    }

    public void setBlockPercent() {
        this.blockPercent = this.blockBase + this.blockBonus;
    }

    public double getReducedPercent() {
        return reducedPercent;
    }

    public void setReducedPercent() {
        double reduced = this.reducedBase + this.armor;
        if ((this.reducedBase + this.armor) > 75) {
            reduced = 75;
        }
        this.reducedPercent = reduced;
    }

    public double getReducedBase() {
        return reducedBase;
    }

    public void setReducedBase(double reducedBase) {
        this.reducedBase = reducedBase;
    }

    public double getCriticalBase() {
        return criticalBase;
    }

    public void setCriticalBase(double criticalBase) {
        this.criticalBase = criticalBase;
    }

    public double getCriticalBonus() {
        return criticalBonus;
    }

    public void setCriticalBonus(double criticalBonus) {
        this.criticalBonus = criticalBonus;
        setCriticalPercent();
    }

    public double getCriticalAmount() {
        return criticalAmount;
    }

    public void setCriticalAmount(double criticalAmount) {
        this.criticalAmount = criticalAmount;
    }

    public double getCriticalPercent() {
        setCriticalPercent();
        return criticalPercent;
    }

    public void setCriticalPercent() {
        this.criticalPercent = this.criticalBase + this.criticalBonus;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }
}
