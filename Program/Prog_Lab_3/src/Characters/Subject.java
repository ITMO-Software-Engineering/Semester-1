package Characters;

import Characters.Interfaces.Move;
import Characters.Interfaces.Say;
import Characters.Interfaces.Think;

public abstract class Subject implements Think, Say, Move {
    String name;

    @Override
    public Void move() {
        return null;
    }

    @Override
    public Void say(String words) {
        return null;
    }

    @Override
    public Void think(String about) {
        return null;
    }
}
