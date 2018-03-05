

public class Calculadora 
{
	double valor1;
	double valor2;
	
	public Calculadora(double valor1,double valor2) 
	{	
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	public double getSoma() 
	{
		double resultado = this.valor1 + this.valor2;
		return resultado;
	}
	public double getSubtracao() 
	{
		double resultado = this.valor1 - this.valor2;
		return resultado;
	}public double getMultiplicacao() 
	{
		double resultado = this.valor1 * this.valor2;
		return resultado;
	}public double getDivisao() 
	{
		double resultado = this.valor1 / this.valor2;
		return resultado;
	}
	
	
	
}
