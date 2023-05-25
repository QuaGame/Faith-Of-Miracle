package com.quateam.game.faith.model.player;

import com.quateam.game.faith.game_system.battle_system.Entity;
import com.quateam.game.faith.game_system.damage.Damage;
import com.quateam.game.faith.model.enemy.Enemy;

public abstract class Player implements Entity {

    private int level;
    private float healPoint;
    private float armorPoint;
    private int money;

    public Player(int level, float healPoint, float armorPoint) {
        this.level = level;
        this.healPoint = healPoint;
        this.armorPoint = armorPoint;
    }

    public void attackOnEnemy(Enemy enemy, Damage damage) {
        enemy.getDamage(damage);
    }

    public void getDamage(Damage damage) {
        float baseDamage = damage.getBaseDamage();

        if(armorPoint == 0.0f) {
            System.out.println("Нанесен " + baseDamage + " по жизни игрока");
            healPoint = healPoint - baseDamage;
        } else {
            System.out.println("Нанесен " + baseDamage + " по броне игрока");
            armorPoint = armorPoint - baseDamage;
        }

        System.out.println("hp: " + healPoint);
        System.out.println("ap: " + armorPoint);
    }

}
