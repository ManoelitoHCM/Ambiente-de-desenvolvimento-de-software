package src;

import utils.Calculadora;

public class MediaSalario {
    double salario1;
    double salario2;
    Calculadora calculadora = new Calculadora();

    public MediaSalario(double salario1, double salario2) {
        this.salario1 = salario1;
        this.salario2 = salario2;
    } 

    double getMediaSalario(){
        return calculadora.soma(salario1, salario2)/2;
    }
}