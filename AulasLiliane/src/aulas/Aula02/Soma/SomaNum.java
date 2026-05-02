package aulas.Aula02.Soma;

public class SomaNum {

    int num1, num2, num3, soma;

    public SomaNum(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;

    }

    public SomaNum(int num1, int num2, int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }


    public int somar(){
        this.soma = this.num1+this.num2;
        return this.soma;

    }

    public int somart(){
        this.soma= this.num1+this.num2+this.num3;
        return this.soma;
    }

    public void printdois(){
        System.out.println("O resultado da soma de " + num1 + " e " + num2 + " é igual a: " + somar());

    }

    public void printtres() {
        System.out.println("O resultado da soma dos tres é : " + somart());
    }
}
