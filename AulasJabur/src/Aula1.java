class People {
    String name;
    int age;
    double height;

    public People(String name, int age, double height){
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void printInfo() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Height : " + height);
    }
}

public class Aula1 {
    public static void main(String[] args){

        People person = new People("Rafael", 19, 1.81);

        person.printInfo();
    }
}