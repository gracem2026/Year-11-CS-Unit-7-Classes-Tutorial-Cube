public class Cube {
    // properties
    private int side;
    // constructors
    public Cube() {
        side = 1;
    }
    public Cube(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = value;
    }
    public void setSide(int value) {
        if (value < 1) {
            throw new IllegalArgumentException("A cube’s side length cannot be less than 1!");
        }
        this.side = value;
    }
    public int getSide() {
        return side;
    }
    public int getVolume() {
        return side * side * side;
    }
    public int getSurfaceArea() {
        return 6 * side * side;
    }
}
