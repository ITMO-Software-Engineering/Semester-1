package Environment.Places;

import Characters.MyCharacter;

public class NorthPole extends Place{


    public class Inscription {
        private String inscription = "OPENED BY WINNY THE POOH, THE POOH FOUND IT.";

        public String getInscription() {
            return inscription;
        }

        public void viewInscription(MyCharacter myCharacter) {
            System.out.println(myCharacter.getName() + " saw an inscription: " + getInscription());
        }
    }
}
