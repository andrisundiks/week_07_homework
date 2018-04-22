package Game;


import Room.Room;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ///// GAME SETUP //////
        Game game = new Game();
        game.welcomeScreen();
        game.player = game.characterCreation();
        Room room = new Room();
        room.populate("Troll", "Big and ugly");

        ///// LAME INTRO /////
        System.out.println("After hours exploring the canyon you find the entrance to the dungeon...");
        System.out.println("I mean, so far it's only a 'room', but think of its potential, man.");
        System.out.println("Press ENTER to continue.");
        scanner.nextLine();

        ///// GAME LOOP /////
        while(!game.over()){
            game.describeRoom(room);
            game.playerTurn(room);
            game.checkVictor(room);
            game.monsterTurn(room);

            System.out.println("\f");
        }
    }


}
