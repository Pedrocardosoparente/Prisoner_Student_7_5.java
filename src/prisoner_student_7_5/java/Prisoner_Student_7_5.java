public class Prisoner_Student_7_5 {
    // Fields
    public String name;
    public double height;
    public int sentence;
    public Cell cell; // Including a Cell field in Prisoner class

    // Constructor
    public Prisoner_Student_7_5(String name, double height, int sentence, Cell cell) {
        this.name = name;
        this.height = height;
        this.sentence = sentence;
        this.cell = cell; // Defining the cell field based on a parameter of the constructor
    }

    // Methods
    public void think() {
        System.out.println("I'll have my revenge.");
    }

    // Modified display method to include cell name
    public void display(boolean b) {
        System.out.println("Name: " + name);
        System.out.println("Height: " + height);
        System.out.println("Sentence: " + sentence);
        System.out.println("Cell Name: " + cell.getName()); // Printing cell name as part of display method
    }
}
