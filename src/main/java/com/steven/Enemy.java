package com.steven;

public class Enemy {
    private String enemyName;
    private int enemyForce;
    private int enemyDefence;
    private boolean isMelee =true;

    public Enemy(String enemyName, int enemyForce, int enemyDefence, boolean isMelee) {
        this.enemyName = enemyName;
        this.enemyForce = enemyForce;
        this.enemyDefence = enemyDefence;
        this.isMelee = isMelee;
    }
    public Enemy(String enemyName, int enemyForce, int enemyDefence) {
        this.enemyName = enemyName;
        this.enemyForce = enemyForce;
        this.enemyDefence = enemyDefence;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "enemyName='" + enemyName + '\'' +
                ", enemyForce=" + enemyForce +
                ", enemyDefence=" + enemyDefence +
                ", isMelee=" + isMelee +
                '}';
    }
}
