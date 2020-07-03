package com.steven;

public class equipment {
    private String equipmentName;
    private int defence;
    private int equipmentCost;

    public equipment(String equipmentName, int defence, int equipmentCost) {
        this.equipmentName = equipmentName;
        this.defence = defence;
        this.equipmentCost = equipmentCost;
    }

    public int getEquipmentCost() {
        return equipmentCost;
    }
}
