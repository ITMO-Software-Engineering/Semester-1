package Characters.Interfaces;

import Characters.Character;

public interface Talk {
    void say(String words);
    void say(Character character, String words);
    void tell(Character character);
    void ask(Character character, String words);
}
