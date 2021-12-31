package Characters.Interfaces;

import Characters.MyCharacter;

public interface Talk {
    void say(String words);
    void say(MyCharacter myCharacter, String words);
    void tell(MyCharacter myCharacter);
    void ask(MyCharacter myCharacter, String words);
}
