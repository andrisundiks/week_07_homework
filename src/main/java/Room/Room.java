package Room;

import Monsters.Monster;

public class Room {
    private Monster monster;
    private String roomDescription;

    public Room(){
        this.monster = null;
        this.roomDescription = "";
    }

    public void populate(String monsterName, String description){
        monster = new Monster(monsterName, description, 20,1,6);
        roomDescription = String.format("In the center of the room you see a %s ready to fight!", monster.getName());
    }

    public Monster getMonster() {
        return monster;
    }

    public String getRoomDescription() {
        return roomDescription;
    }
}
