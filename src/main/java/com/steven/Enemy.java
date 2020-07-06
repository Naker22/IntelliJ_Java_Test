package com.steven;

public class Enemy {
    private String enemyName;
    private int enemyForce;
    private int enemyDefence;
    private int health = 100;
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

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getEnemyForce() {
        return enemyForce;
    }

    public int getEnemyDefence() {
        return enemyDefence;
    }

    public String getEnemyName() {
        return enemyName;
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
