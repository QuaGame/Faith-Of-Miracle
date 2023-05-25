package com.quateam.game.faith.model.enemy;

public class Lupizdrik extends Enemy {

    private int x;
    private int y;
    public Lupizdrik(int level, float healPoint, float armorPoint) {
        super("Лупиздрик", "description", "type", null, level, healPoint, armorPoint);
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }
}
