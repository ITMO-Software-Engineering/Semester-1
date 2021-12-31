package Characters.MainCharacters;

public class Piglet extends MainCharacter {
    public Piglet() {
        super("Piglet");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Piglet(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Piglet(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public Piglet(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }
}
