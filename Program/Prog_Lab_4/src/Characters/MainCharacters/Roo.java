package Characters.MainCharacters;

public class Roo extends MainCharacter {
    public Roo() {
        super("Roo");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Roo(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public Roo(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public Roo(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }
}
