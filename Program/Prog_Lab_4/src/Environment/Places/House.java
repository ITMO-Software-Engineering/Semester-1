package Environment.Places;

import Characters.*;
import Characters.MainCharacters.*;


public class House extends Place {

    private MainCharacter owner;
    private MainCharacter[] neighbors = new MainCharacter[10];
    private int numNeighbors = 0;

    public House() {
        this.owner = null;
        this.placeName = "a House";
        System.out.println("There is a house.");
    }

    public House(MainCharacter owner) {
        this.owner = owner;
        this.placeName = this.owner.getName() + "'s House";
        System.out.println("There is a house where " + this.owner + " lives.");
    }

    public void setNeighbors(MainCharacter[] neighbors) {
        this.neighbors = neighbors;
        this.numNeighbors += neighbors.length;
        for(MainCharacter mainChar : neighbors) {
            mainChar.getHouse().addNeighbor(this.owner);
        }
    }

    public void addNeighbor(MainCharacter neighbor) {
        this.neighbors[numNeighbors] = neighbor;
        this.numNeighbors ++;
        neighbor.getHouse().addNeighbor(this.owner);
    }

    public MainCharacter getOwner() {
        return this.owner;
    }

    public MainCharacter[] getNeighbors() {
        return this.neighbors;
    }

}
