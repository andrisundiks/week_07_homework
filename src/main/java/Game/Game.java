package Game;

import Abilities.*;
import Player.*;
import Weapons.*;
import Room.*;

import java.util.Scanner;

public class Game {
    public Scanner scanner = new Scanner(System.in);

    Player player;
    String name;
    Weapon sword = new Sword("Longsword", 1,8,75);
    Ability doubleStrike = new DoubleStrike("Double Strike", "fighter", "Hit 2 times with weapon");

    public Game(){
        this.player = null;
    }

    public void welcomeScreen(){

        System.out.println("Welcome to this demo. Err... lorem ipsum, I guess?");
        System.out.println("Press ENTER to continue.");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
}

    public Player characterCreation(){

        System.out.println("Pick a name for your charcater: ");
        String name = scanner.nextLine();

        System.out.println("Pick the number of your preferred class: ");
        System.out.println("1. Fighter - A melee specialist");
        System.out.println("1. Just pick fighter, the rest s WIP");

        String classNumber = scanner.nextLine();

        return new Fighter(name, "fighter", sword, doubleStrike);
    }

    public void describeRoom(Room room){
        System.out.println(room.getRoomDescription());
    }

    public void playerTurn(Room room){
        Room thisRoom = room;
        System.out.println("What would you like to do?");
        System.out.println("(1) Attack using your weapon.");
        System.out.println("(2) Use your special ability.");
        String playerInput = scanner.nextLine();

        if(playerInput.equals("1")){
            System.out.println(player.attack(room.getMonster()));
            player.getAbility().addCoolDown();
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
        } else if(playerInput.equals("2")){
            if(player.getAbility().getCoolDown() >= 0) {
                System.out.println(player.getAbility().specialAttack(room.getMonster(), player.getWeapon()));
                player.getAbility().addCoolDown();
                player.getAbility().setCoolDown(-2);
                System.out.println("Press ENTER to continue.");
                scanner.nextLine();
            } else{
                System.out.println("Your ability is on cooldown! Please pick a different option");
                System.out.println("Press ENTER to continue.");
                scanner.nextLine();
                playerTurn(thisRoom);
            }
        } else{
            System.out.println("Please pick one of the options above.");
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
            playerTurn(thisRoom);
        }
    }

    public void monsterTurn(Room room){
        if(room.getMonster().rollAttack()){
            int damage = room.getMonster().rollDamage();
            player.takeDamage(damage);
            System.out.println(String.format("The %s hits you dealing %s points of damage!", room.getMonster().getName(), damage));
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
        } else {
            System.out.println(String.format("The %s jumps at you but you manage to dodge its attack!", room.getMonster().getName()));
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
        }
    }

    public void checkVictor(Room room){
        if(room.getMonster().getHitPoints() <= 0){
            System.out.println(String.format("You have killed the %s!", room.getMonster().getName()));
            System.out.println("Press ENTER to continue.");
            scanner.nextLine();
        } else if(player.getHitPoints() <= 0){
            System.out.println("Get dunked on, son! GG EZ");
        }
    }

    public Boolean over(){
        if(player.getHitPoints() <= 0){
            return true;
        } else {
            return false;
        }
    }
}
