package Ex.Ex2;

public class Retangle {

    double side1, side2;
    double areaR;

    public Retangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.calcRetangle();
    }

    public double calcRetangle() {
        this.areaR = this.side1*this.side2;
        return this.areaR;
    }
}
