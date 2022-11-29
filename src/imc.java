package src;

import utils.Calculadora;

public class imc {

    Calculadora calculadora = new Calculadora();

    public double calculoIMC(double altura, double peso) {
		return calculadora.divisao(peso, calculadora.exponencial(altura));
	}
}
