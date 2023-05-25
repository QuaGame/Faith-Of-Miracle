package com.quateam.game.faith.story.battle.tutorial;

import com.quateam.game.faith.game_system.battle_system.Cell;
import com.quateam.game.faith.game_system.battle_system.CellType;
import com.quateam.game.faith.game_system.damage.Damage;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.enemy.Lupizdrik;
import com.quateam.game.faith.model.player.Player;
import com.quateam.game.faith.model.player.Warrior;
import com.quateam.game.faith.story.battle.BattleType;
import com.quateam.game.faith.story.battle.Playground;

import java.util.ArrayList;
import java.util.List;

public class TutorialBattle extends Playground {

    private List<Enemy> enemyList = new ArrayList<>();
    public BattleType battleType;

    private Player player = null;

    Cell[][] gameBoard;


    @Override
    public void setStatus(BattleType battleType) {
        this.battleType = battleType;
    }

    @Override
    public void addEnemy(Enemy enemy) {
        enemyList.add(enemy);
    }

    @Override
    public void setPlayer(Player player) {
        this.player = player;
    }

    @Override
    public void startBattle(Cell[][] gameBoard) {
        if(player == null) {
            System.out.println("Player is null");
            return;
        }

        if(enemyList.isEmpty()) {
            System.out.println("Enemy is not be 0");
            return;
        }

        this.gameBoard = gameBoard;
        for(int line = 0; line < 9; line++) {
            for(int column = 0; column < 1; column++) {
                Cell cell = gameBoard[line][column];
                if(cell.x == player.getX() & cell.y == player.getY()) {
                    System.out.print("Игрок на x:" + cell.x + " y:" + cell.y );
                    cell.setEntity(player);
                    cell.setCellType(CellType.HAS_PLAYER);
                    break;
                }
            }
        }
        System.out.println();

        for(Enemy enemy: enemyList) {
            for(int line = 0; line < 9; line++) {
                for(int column = 0; column < 1; column++) {
                    Cell cell = gameBoard[line][column];
                    if(cell.x == enemy.getX() & cell.y == enemy.getY()) {
                        System.out.printf("%s на x:%d y:%d\n", enemy.getName(), cell.x, cell.y);
                        cell.setEntity(enemy);
                        cell.setCellType(CellType.HAS_ENEMY);
                        break;
                    }
                }
            }
        }

        System.out.println();
        for(int line = 0; line < 9; line++) {
            for(int column = 0; column < 1; column++) {
                Cell cell = gameBoard[line][column];
                System.out.printf("x:%d y:%d type:%s entity:%s%n", cell.x, cell.y, cell.cellType, cell.entity);
            }
        }

        playerMove(2,1);
    }

    public void playerMove(int x, int y) {
        Cell cell = null;
        for(int line = 0; line < 9; line++) {
            for(int column = 0; column < 1; column++) {
                Cell currentCell = gameBoard[line][column];
                if(currentCell.x == x && currentCell.y == y) {
                    cell = currentCell;
                }
            }
        }

        assert cell != null;
        Enemy enemy = (Enemy) cell.entity;
        System.out.println(enemy);

        player.attackOnEnemy(enemy, new Damage(1));
    }

    @Override
    public void stopBattle() {

    }

}
