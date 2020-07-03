package com.steven;

public class Weapon {
    private String weaponName;
    private int weaponCost;
    private int weaponDamage;
    private int weaponRange;
    private boolean forMelee = true;

    public Weapon(String weaponName, int weaponCost, int weaponDamage, int weaponRange, boolean forMelee) {
        this.weaponName = weaponName;
        this.weaponCost = weaponCost;
        this.weaponDamage = weaponDamage;
        this.weaponRange = weaponRange;
        this.forMelee = forMelee;
    }
    public Weapon(String weaponName, int weaponCost, int weaponDamage, int weaponRange) {
        this.weaponName = weaponName;
        this.weaponCost = weaponCost;
        this.weaponDamage = weaponDamage;
        this.weaponRange = weaponRange;
    }

    public int getWeaponCost() {
        return weaponCost;
    }
}
