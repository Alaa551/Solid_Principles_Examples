package OpenClosed.example2.after_apply_it;

public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
       // draw square
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }


}
