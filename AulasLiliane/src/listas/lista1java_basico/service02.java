package listas.lista1java_basico;

public class service02 {

    float a = 7, b = 8, c = 9, d = 4, e = 5, f = 6;
    float m1, m2, sm, mt;

    public service02(){
        this.media();
    }

    public void media(){
        this.m1 = (a+b+c)/3;
        this.m2 = (d+e+f)/3;
        this.sm = this.m1+this.m2;
        this.mt = (this.m1+this.m2)/2;
        System.out.println("Average of 7, 8, 9 : " + this.m1 + " \n" +
                "Averages of 4, 5, 6 : " + this.m2 + " \n" +
                "Sum of the averages: " + this.sm + " \n" +
                "Average of the averages: " + this.mt);
    }

}
