package com.quateam.game.faith.story.battle.tutorial;

import com.quateam.game.faith.game_system.battle_system.Cell;
import com.quateam.game.faith.game_system.battle_system.CellType;
import com.quateam.game.faith.model.enemy.Enemy;
import com.quateam.game.faith.model.enemy.Lupizdrik;
import com.quateam.game.faith.model.player.Player;
import com.quateam.game.faith.model.player.Warrior;
import com.quateam.game.faith.story.battle.BattleType;
import com.quateam.game.faith.story.battle.Playground;

public class TutorialLauncher {

    public static void main(String[] args) {
        Cell[][] gameBoard = {
                {new Cell(1,1, CellType.NONE)}, {new Cell(1,2, CellType.NONE)}, {new Cell(1,3, CellType.NONE)},
                {new Cell(2,1, CellType.NONE)}, {new Cell(2,2, CellType.NONE)}, {new Cell(2,3, CellType.NONE)},
                {new Cell(3,1, CellType.NONE)}, {new Cell(3,2, CellType.NONE)}, {new Cell(3,3, CellType.NONE)}
        };

        Player player = new Warrior(1,1,1);
        player.setX(1);
        player.setY(1);

        Enemy enemy1 = new Lupizdrik(1,1,1);
        enemy1.setX(2);
        enemy1.setY(1);

        Enemy enemy2 = new Lupizdrik(1,1,1);
        enemy2.setX(2);
        enemy2.setY(2);

        Playground playground = new TutorialBattle();
        playground.setStatus(BattleType.STORY);
        playground.setPlayer(player);
        playground.addEnemy(enemy1);
        playground.addEnemy(enemy2);
        playground.startBattle(gameBoard);
    }

}
