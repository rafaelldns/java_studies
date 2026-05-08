package static_members.ex1.entities;

public class Rectangle {

    public String format;
    public double width, height;

    public Rectangle(){
    }

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width + height);
    }

    public double diagonal(){
        return Math.sqrt(width * width + height * height);
    }

    @Override
    public String toString (){
        return "AREA = "
                + String.format("%.2f", area())
                + "\nPERIMETER = "
                + String.format("%.2f", perimeter())
                + "\nDIAGONAL = "
                + String.format("%.2f", diagonal());
    }
}
