package Characters.MainCharacters;

public class Kanga extends MainCharacter {
    public Kanga() {
        super("Piglet");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Kanga(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Kanga(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public Kanga(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }
}
