package Characters.Interfaces;

import Characters.Character;

public interface Say {
    void say();
    void say(String words);
    void say(Character character);
    void say(Character character, String words);
}
