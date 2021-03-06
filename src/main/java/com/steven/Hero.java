package com.steven;

public class Hero {
    private String heroName;
    private int force;
    private int heroCost;
    private int heroDefence;
    private int health =100;
    private boolean isMelee =true;
    public Hero(String heroName, int force, int heroCost,int heroDefence, boolean isMelee){
        this.heroName = heroName;
        this.force=force;
        this.heroCost = heroCost;
        this.heroDefence = heroDefence;
        this.isMelee = isMelee;
    }

    public Hero(String heroName, int force, int heroCost,int heroDefence){
        this.heroName = heroName;
        this.force=force;
        this.heroCost = heroCost;
        this.heroDefence = heroDefence;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + heroName + '\'' +
                ", force=" + force +
                ", cost=" + heroCost +
                ", isMelee=" + isMelee +
                '}';
    }

    public int getHeroCost() {
        return heroCost;
    }
    public boolean getTypeOfAttack(){
        return isMelee;
    }

    public int getHeroDefence() {
        return heroDefence;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getForce() {
        return force;
    }
}
