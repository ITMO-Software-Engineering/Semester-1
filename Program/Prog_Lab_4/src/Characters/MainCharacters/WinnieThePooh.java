package Characters.MainCharacters;

public class WinnieThePooh extends MainCharacter {
    public WinnieThePooh() {
        super("Winnie The Pooh");
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public WinnieThePooh(String name) {
        super(name);
        System.out.println("There is a character called " + this.getName() + ".");
    }
    public WinnieThePooh(Gender gender) {
        super(gender);
        System.out.println("There is a " + this.gender.toString() + " character.");
    }
    public WinnieThePooh(String name, Gender gender) {
        super(name, gender);
        System.out.println("There is a " + this.gender.toString() + " character called " + this.getName() + ".");
    }
}
