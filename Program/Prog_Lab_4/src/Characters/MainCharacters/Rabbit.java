package Characters.MainCharacters;

public class Rabbit extends MainCharacter {
    public Rabbit() {
        super("Rabbit");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Rabbit(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Rabbit(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public Rabbit(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }

    public void coverMouthWithClaw() {

    }
}
