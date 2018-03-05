import junit.framework.TestCase;

import org.junit.Test;

public class CalculadoraTeste extends TestCase {

	public void testaSoma() 
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 15;
		Calculadora Teste = new Calculadora(valor1,valor2);
		double resultadoReal = Teste.getSoma();
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	public void testaSubtracao() throws ValorMenorZeroException
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 5;
		Calculadora Teste = new Calculadora(valor1,valor2);
		double resultadoReal = Teste.getSubtracao();
		if(resultadoReal < 0) 
		{
			throw new ValorMenorZeroException();
		}
		else 
		{
		assertEquals(resultadoEsperado, resultadoReal);
		}
	}
	
	public void testaMultiplicacao() 
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 50;
		Calculadora Teste = new Calculadora(valor1,valor2);
		double resultadoReal = Teste.getMultiplicacao();
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	public void testaDivisao() 
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 2;
		Calculadora Teste = new Calculadora(valor1,valor2);
		double resultadoReal = Teste.getDivisao();
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
}
