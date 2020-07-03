package com.steven;

public class Equipment {
    private String equipmentName;
    private int defence;
    private int equipmentCost;

    public Equipment(String equipmentName, int defence, int equipmentCost) {
        this.equipmentName = equipmentName;
        this.defence = defence;
        this.equipmentCost = equipmentCost;
    }

    public int getEquipmentCost() {
        return equipmentCost;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "equipmentName='" + equipmentName + '\'' +
                ", defence=" + defence +
                ", equipmentCost=" + equipmentCost +
                '}';
    }
}
