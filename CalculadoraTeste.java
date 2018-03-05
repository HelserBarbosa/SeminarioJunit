import junit.framework.TestCase;

import static org.junit.jupiter.api.Assertions.assertThrows;

import java.lang.reflect.Executable;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class CalculadoraTeste extends TestCase {

	private Calculadora calc;
	
	@BeforeEach
	public void setUp() {
		calc = new Calculadora();
	}
	
	@Test
	public void testaSoma() 
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 15;
		double resultadoReal = calc.getSoma(valor1,valor2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	@Test
	public void testaSubtracao() throws ValorMenorZeroException
	{
		double valor1 = 10;
		double valor2 = 15;
		Throwable ValorMenorZeroException = assertThrows(ValorMenorZeroException.class, () -> { calc.getSubtracao(valor1,valor2);});
	}
	
	public void testaMultiplicacao()
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 50;;
		double resultadoReal = calc.getMultiplicacao(valor1,valor2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	@Test
	public void testaDivisao() 
	{
		double valor1 = 10;
		double valor2 = 5;
		double resultadoEsperado = 2;
		double resultadoReal = calc.getDivisao(valor1,valor2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
}