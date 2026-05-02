package Ex.Ex2;

public class Square {

    double side;
    double areaS;

    public Square(double side){
        this.side = side;
        this.calcSquare();
    }

    public double calcSquare(){
        this.areaS = this.side*this.side;
        return this.areaS;
    }

}
