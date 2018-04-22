package Interfaces;

import Monsters.Monster;
import Weapons.Weapon;

import java.util.Random;

public interface IOffensive {
    Random rand = new Random();
    String specialAttack(Monster target, Weapon weapon);
}
