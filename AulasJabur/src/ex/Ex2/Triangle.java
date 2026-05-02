package ex.Ex2;

public class Triangle {

    double base, side1, side2;
    double areaTE;
    double bdI, hI, areaTI;
    double sP, areaTS;

    public Triangle(double base, double side1, double side2){
        this.base = base;
        this.side1 = side1;
        this.side2 = side2;
        this.triangleValid();
    }

    public void triangleValid(){
        if((this.base + this.side1 > this.side2) &&
        (this.base + this.side2 > this.side1) &&
        (this.side1 + this.side2 > this.base)){
            System.out.println("This Triangle is Valid!!");
            this.triangleVerify();
        }else {
            System.out.println("This Triangle is Not Valid!");
        }
    }

    public void triangleVerify(){
        if ( this.base == this.side1 && this.side1 == this.side2){
            System.out.println("This Triangle is Equilateral!");
            this.triangleEqui();
        } else if ( this.base == this.side1 ||
        this.base == this.side2 || this.side1 == this.side2) {
            System.out.println("This Triangle is Isosceles");
            this.triangleIsos();
        }else{
            System.out.println("This triangle is Scalene");
            this.triangleScal();
        }

    }

    public void triangleEqui(){
        this.areaTE = ((this.base*this.base * Math.sqrt(3))/4);
        System.out.println("Area of Equilateral Triangle: " + this.areaTE + "cm²");;
    }

    public void triangleIsos(){
        this.bdI = this.base/2;
        this.hI = Math.sqrt(Math.pow(this.side1, 2) - Math.pow(this.bdI, 2));
        this.areaTI = (this.base*this.hI)/2;
        System.out.println("Area of Isoscele Triangle: " + this.areaTI + "cm²");
    }

    public void triangleScal(){
        this.sP = (this.base + this.side1 + this.side2)/2;
        this.areaTS = Math.sqrt(this.sP*(this.sP - this.base)*(this.sP - this.side1)*(this.sP - this.side2));
        System.out.println("Area of Scalene Triangle: " + this.areaTS + "cm²");
    }

}
