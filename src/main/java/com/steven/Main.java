package com.steven;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Hero Balanar = new Hero("balanar",4,350,6);
        Hero Archer = new Hero("Archer",2,250,7,false);
        Hero Linter = new Hero("Linter",6,500,3);
        Hero Keiry = new Hero("Keiry",8,700,4,false);

        List<Hero> heroes = new ArrayList<>();
        heroes.add(Balanar);
        heroes.add(Archer);
        heroes.add(Linter);
        heroes.add(Keiry);

        Weapon simpleSword = new Weapon("Sword",100,3,3);
        Weapon superbow = new Weapon("Super bow",600,7,9);
        Weapon longSword = new Weapon("Long sword",300,9,4);
        Weapon longBow = new Weapon("Long bow",250,4,9);
        List<Weapon> meleeWeapons = new ArrayList<>();
        meleeWeapons.add(simpleSword);
        meleeWeapons.add(longSword);
        List<Weapon> rangeWeapons = new ArrayList<>();
        rangeWeapons.add(superbow);
        rangeWeapons.add(longBow);

        Equipment cuirass = new Equipment("Cuirass",7,400);
        Equipment cloak = new Equipment("Cloak",3,200);
        Equipment shadowCuirass = new Equipment("Shadow Cuirass",9,550);
        Equipment beastCloak = new Equipment("Beast Cloak",6,350);

        List<Equipment> equipments = new ArrayList<>();
        equipments.add(cuirass);
        equipments.add(cloak);
        equipments.add(shadowCuirass);
        equipments.add(beastCloak);

        Enemy brocker = new Enemy("Brocker",7,7);
        Enemy moner = new Enemy("Moner",4,3);
        Enemy keeper = new Enemy("Keeper",9,9);
        Enemy joker = new Enemy("Joker",7,7);
        List<Enemy> enemies = new ArrayList<>();
        enemies.add(brocker);
        enemies.add(moner);
        enemies.add(keeper);
        enemies.add(joker);

        Scanner scan = new Scanner(System.in);
        String start="";

        while(!start.toLowerCase().equals("play")){
            System.out.println("Write PLAY to start game\nWrite Exit to exit game");
            start = scan.next();
            if(start.toLowerCase().equals("exit")){
                System.exit(0);
            }
            if(start.toLowerCase().equals("play")){
                break;
            }
            System.out.println("Wrong input");
        }

        System.out.print("Enter your name: ");
        String name = scan.next();
        User player1 = new User(name);
        System.out.print("Pick hero(write number counting from 0): ");
        for (Enemy enemy : enemies) {
            System.out.println(enemy.toString());
        }
        player1.setHero(heroes.get(scan.nextByte()));
        System.out.print("Pick weapon(write number counting from 0): ");
        for (Weapon weapon : meleeWeapons) {
            System.out.println(weapon.toString());
        }
        player1.setWeapon(meleeWeapons.get(scan.nextByte()));
        System.out.print("Pick hero(write number counting from 0): ");
        for (Equipment equipment : equipments) {
            System.out.println(equipment.toString());
        }
        player1.setEquipment(equipments.get(scan.nextByte()));
        System.out.println("Your Hero:");
        System.out.println(player1.toString());
        System.out.println(player1.getBalance() - heroes.get(0).getHeroCost());
        System.exit(0);
    }
}
