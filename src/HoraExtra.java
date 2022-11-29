package src;

import utils.Calculadora;

public class HoraExtra {
    double qtdeHoras;
    double salarioHora;
    Calculadora calculadora = new Calculadora();

    public HoraExtra(double qtdeHoras, double salarioHora) {
        this.qtdeHoras = qtdeHoras;
        this.salarioHora = salarioHora;
        } 

    double getHoraExtra(){
        double salario = calculadora.multiplicacao(qtdeHoras, salarioHora);    
        return calculadora.multiplicacao(salario, 1.5);
    }
}