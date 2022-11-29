package utils;

public class Calculadora {
	public double soma(double numeroA, double numeroB) {
		return numeroA + numeroB;
	}
	
	public double subtracao(double numeroA, double numeroB) {
		return numeroA - numeroB;
	}
	
	public double multiplicacao(double numeroA, double numeroB) {
		return numeroA * numeroB;
	}
	
	public double divisao() {
		return 0 ;
	}
	
	public double exponencial() {
		return 0 ;
	}
	
	public double raizQuadrada() {
		return 0 ;
	}
	
    public double piso (double numeroA, double numeroB) {
        return Math.min(numeroA, numeroB);
    }

    public double teto (double numeroA, double numeroB) {
        return Math.max(numeroA, numeroB);
    }
}