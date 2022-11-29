package src;

import utils.Calculadora;

public class PisoSalarial {
    double salario1;
    double salario2;
    Calculadora calculadora = new Calculadora();

    public PisoSalarial(double salario1, double salario2) {
        this.salario1 = salario1;
        this.salario2 = salario2;
    } 

    double getPisoSalarial(){
        return calculadora.piso(salario1, salario2);
    }
}