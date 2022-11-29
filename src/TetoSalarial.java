package src;

import utils.Calculadora;

public class TetoSalarial {
    double salario1;
    double salario2;
    Calculadora calculadora = new Calculadora();

    public TetoSalarial(double salario1, double salario2) {
        this.salario1 = salario1;
        this.salario2 = salario2;
    }

    double getTetoSalarial(){
        return calculadora.teto(salario1, salario2);
    }
}