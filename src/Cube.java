public class Cube {
    private int side;

    public Cube(int side) {
        setSide(side);
    }

    public Cube() {
        getSide();
    }

    public int getSide(){
        if (side == 0){
            side = 1;
        }
        return side;
    }
    public void setSide(int side){
        if (side < 1) throw new IllegalArgumentException("A cube’s side length must be equal to or greater than 1!");
        if (side < 1){
            System.out.println("A cube's side lengths must be equal to or greater than 1!");
        } else {
            this.side = side;
        }
    }


    public int calculateSurfaceArea(){
        int surfaceArea = side * side * 6;
        return surfaceArea;
    }
    public int calculateVolume(){
        int volume = side * side * side;
        return volume;
    }
    public String toString(){
        return "";
    }
}
