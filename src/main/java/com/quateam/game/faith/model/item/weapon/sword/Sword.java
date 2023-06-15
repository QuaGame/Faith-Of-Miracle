package com.quateam.game.faith.model.item.weapon.sword;

import com.quateam.game.faith.model.item.ItemRarity;
import com.quateam.game.faith.model.item.weapon.DamageType;
import com.quateam.game.faith.model.item.weapon.Weapon;
import com.quateam.game.faith.model.item.weapon.WeaponType;

public abstract class Sword extends Weapon {


    public Sword(String itemName, String description, ItemRarity itemRarity, float price, float baseDamage, WeaponType weaponType, DamageType damageType) {
        super(itemName, description, itemRarity, price, baseDamage, weaponType.HAND, damageType.PHYSIC);
    }
}