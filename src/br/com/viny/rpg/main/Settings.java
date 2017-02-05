package br.com.viny.rpg.main;

public class Settings {

    //NEW PLAYER
    private int hit_Point_Base = 1000; // Hitpoint
    private double attack_Base = 150;  // Attack Base
    private double attack_Bonus = 0;
    private double attack_Interval_Percent = 0.2;  // Arratk Interval Percent - Percentage for variation of attack. exemple: 0.2 = 20%
    private double accuracy_Base = 0;    // Accuracy Base
    private double accuracy_Bonus = 0;
    private double accuracy_Percent = 0;    // Accuracy Percent - Percentage to reduce evasion of something. exemplo:  
    private double block_Base = 15;   // Evasion Base
    private double block_Bonus = 0;
    private double reduced_Base = 0;    // Armor Base
    private double armor = 0;
    private double critical_Base = 15;   // Critical Base - Basic percentage to cause critical hit. exemple: 15 = 15%
    private double critical_Bonus = 0;
    private double critical_Amout = 30;   // Critical Amount - Percentage increase in damage. exemple: 30 = 30%
   

    public Settings() {
    }

    public int getHit_Point_Base() {
        return hit_Point_Base;
    }

    public void setHit_Point_Base(int hit_Point_Base) {
        this.hit_Point_Base = hit_Point_Base;
    }

    public double getAttack_Base() {
        return attack_Base;
    }

    public void setAttack_Base(double attack_Base) {
        this.attack_Base = attack_Base;
    }

    public double getAttack_Bonus() {
        return attack_Bonus;
    }

    public void setAttack_Bonus(double attack_Bonus) {
        this.attack_Bonus = attack_Bonus;
    }

    public double getAttack_Interval_Percent() {
        return attack_Interval_Percent;
    }

    public void setAttack_Interval_Percent(double attack_Interval_Percent) {
        this.attack_Interval_Percent = attack_Interval_Percent;
    }

    public double getAccuracy_Base() {
        return accuracy_Base;
    }

    public void setAccuracy_Base(double accuracy_Base) {
        this.accuracy_Base = accuracy_Base;
    }

    public double getAccuracy_Bonus() {
        return accuracy_Bonus;
    }

    public void setAccuracy_Bonus(double accuracy_Bonus) {
        this.accuracy_Bonus = accuracy_Bonus;
    }

    public double getAccuracy_Percent() {
        return accuracy_Percent;
    }

    public void setAccuracy_Percent(double accuracy_Percent) {
        this.accuracy_Percent = accuracy_Percent;
    }

    public double getBlock_Base() {
        return block_Base;
    }

    public void setBlock_Base(double block_Base) {
        this.block_Base = block_Base;
    }

    public double getBlock_Bonus() {
        return block_Bonus;
    }

    public void setBlock_Bonus(double block_Bonus) {
        this.block_Bonus = block_Bonus;
    }

    public double getReduced_Base() {
        return reduced_Base;
    }

    public void setReduced_Base(double reduced_Base) {
        this.reduced_Base = reduced_Base;
    }

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getCritical_Base() {
        return critical_Base;
    }

    public void setCritical_Base(double critical_Base) {
        this.critical_Base = critical_Base;
    }

    public double getCritical_Bonus() {
        return critical_Bonus;
    }

    public void setCritical_Bonus(double critical_Bonus) {
        this.critical_Bonus = critical_Bonus;
    }

    public double getCritical_Amout() {
        return critical_Amout;
    }

    public void setCritical_Amout(double critical_Amout) {
        this.critical_Amout = critical_Amout;
    }

}
