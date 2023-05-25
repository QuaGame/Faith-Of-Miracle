package com.quateam.game.faith.model.player;


public class Warrior extends Player {

    public int x;
    public int y;

    public Warrior(int level, float healPoint, float armorPoint) {
        super(level, healPoint, armorPoint);
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

    @Override
    public String toString() {
        return "Warrior";
    }
}
