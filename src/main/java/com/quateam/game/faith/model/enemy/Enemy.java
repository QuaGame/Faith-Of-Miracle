package com.quateam.game.faith.model.enemy;

import com.quateam.game.faith.game_system.battle_system.Entity;
import com.quateam.game.faith.game_system.damage.Damage;
import com.quateam.game.faith.game_system.Location;
import com.quateam.game.faith.model.player.Player;

public abstract class Enemy implements Entity {

    private String name;
    private String description;
    private String type;
    private Location location;
    private int level;
    private float healPoint;
    private float armorPoint;

    public Enemy(String name, String description, String type, Location location,
                 int level, float healPoint, float armorPoint) {
        this.name = name;
        this.description = description;
        this.type = type;
        this.location = location;
        this.level = level;
        this.healPoint = healPoint;
        this.armorPoint = armorPoint;
    }

    public void attackOnPlayer(Player player, Damage damage) {
        player.getDamage(damage);
    }

    public void getDamage(Damage damage) {
        float baseDamage = damage.getBaseDamage();

        if(armorPoint == 0.0f) {
            System.out.println("Нанесен " + baseDamage + " по жизни противгика");
            healPoint = healPoint - baseDamage;
        } else {
            System.out.println("Нанесен " + baseDamage + " по броне противгика");
            armorPoint = armorPoint - baseDamage;
        }

        System.out.println("hp: " + healPoint);
        System.out.println("ap: " + armorPoint);
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getType() {
        return type;
    }

    public Location getLocation() {
        return location;
    }
}
