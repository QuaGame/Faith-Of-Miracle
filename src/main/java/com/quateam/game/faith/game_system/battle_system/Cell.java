package com.quateam.game.faith.game_system.battle_system;

public class Cell {

    public int x;
    public int y;
    public CellType cellType;
    public Entity entity;

    public Cell(int x, int y, CellType cellType) {
        this.x = x;
        this.y = y;
        this.cellType = cellType;
    }

    public void setEntity(Entity entity) {
        this.entity = entity;
    }

    public void setCellType(CellType cellType) {
        this.cellType = cellType;
    }
}
