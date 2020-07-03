package com.steven;

public class User {
    private String userName;
    private Hero hero;
    private Weapon weapon;
    private Equipment equipment;
    private int balance=1000;
    public User(String userName){
        this.userName = userName;
    }

    public void setHero(Hero hero) {
        this.hero = hero;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "userName='" + userName + '\'' +
                ",\n hero=" + hero +
                ",\n weapon=" + weapon +
                ",\n equipment=" + equipment +
                ",\n balance=" + balance +"$";
    }
}
