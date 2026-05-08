package static_members.ex3.entities;

public class Student {

    public String name;
    public double a;
    public double b;
    public double c;

    public double CalcMedia(){
        return a+b+c;
    }

    public String Validation(){
        if (CalcMedia() >= 60){
            return "\nPASS!" ;
        }else{
            return "FAILED!";
        }
    }

    public String toString(){
        if(CalcMedia() >= 60) {
            return "NAME: "
                    +name
                    + "\nFINAL GRADE: "
                    + String.format("%.2f", CalcMedia())
                    + Validation();
        }else {
            return "NAME: "
                    +name
                    +"\nFINAL GRADE: "
                    +String.format("%.2f%n", CalcMedia())
                    +Validation()
                    +"\nMISSING: "
                    +String.format("%.2f", (60-CalcMedia()));
        }
    }
}
