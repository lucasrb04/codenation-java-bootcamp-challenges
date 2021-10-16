package br.com.codenation.calculadora;


public class CalculadoraSalario {

	public static void main(String[] args) {
		System.out.println(calcularSalarioLiquido(6750));
	}

	public static long calcularSalarioLiquido(double salarioBase) {
		//Use o Math.round apenas no final do método para arredondar o valor final.
		//Documentação do método: https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#round-double-
		return Math.round(calcularIRRF(salarioBase));
	}
	
	
	//Exemplo de método que pode ser criado para separar melhor as responsábilidades de seu algorítmo
	private static double calcularInss(double salarioBase) {
		double percentualInss = 0;
		if(salarioBase <= 1500){
			percentualInss = 0.08;
		} else if (salarioBase > 1500 && salarioBase <= 4000) {
			percentualInss = 0.09;
		} else if(salarioBase > 4000){
			percentualInss = 0.11;
		}
		return salarioBase * (1 - percentualInss);
	}

	private static double calcularIRRF(double salarioBase) {
		double salarioInss = calcularInss(salarioBase);
		double percentualIRRF = 0;
		if(salarioBase < 1039) {
			return 0;
		} else if (salarioInss > 3000 && salarioInss <= 6000) {
			percentualIRRF = 0.075;
		} else if (salarioInss > 6000){
			percentualIRRF = 0.15;
		}
		return salarioInss * (1 - percentualIRRF);
	}

}
/*Dúvidas ou Problemas?
Manda e-mail para o meajuda@codenation.dev que iremos te ajudar! 
*/