package static_members.ex2.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;
    public double readjust = 0;

    public Employee(){
    }

    public double NetSalary(){
        return grossSalary - tax + readjust;
    }

    public void IncreaseSalary(double percentage){
        double aux;
        readjust = (grossSalary/100) * percentage;
        NetSalary();
    }

    public String toString(){
        return name
                +", $ "
                +String.format("%.2f", NetSalary());
    }
}
