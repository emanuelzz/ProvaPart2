import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ValoresTest {

	private Valores valores = null;

	@Before
	public void teste() {
		valores = new Valores();
		valores.ValorInt.add(5);
		valores.ValorInt.add(9);
		valores.ValorInt.add(8);
		valores.ValorInt.add(10);
		valores.ValorInt.add(3);
		valores.ValorInt.add(1);
	}
	
	public void limparLista(){
		valores.ValorInt.clear();
	}
	
	@Test
	public void testeInsComMenosQueDezNumeros() {
		assertTrue(valores.ins(7));
		assertTrue(valores.ins(6));
		assertTrue(valores.ins(3));
		assertTrue(valores.ins(5));
		
	}

	@Test
	public void testeInsComMaisQueDezNumeros() {
		for (int i = 0; i < 10; i++) {
			valores.ValorInt.add(i);
		}
		assertFalse("testeInsComMaisQueDezNumeros",valores.ins(12));
		assertFalse("testeInsComMaisQueDezNumeros",valores.ins(15));
		assertFalse("testeInsComMaisQueDezNumeros",valores.ins(21));
		assertFalse("testeInsComMaisQueDezNumeros",valores.ins(11));
		assertFalse("testeInsComMaisQueDezNumeros",valores.ins(4));
	}

	@Test
	public void testInsComNumeroNegativo() {
		assertFalse(valores.ins(-5));
		assertFalse(valores.ins(-3));
		assertFalse(valores.ins(-8));
		assertFalse(valores.ins(-1));
		assertFalse(valores.ins(-10));
	}
	

	@Test
	public void testDelComListaPreenchida() {
		assertEquals("testeDelComListaPreenchida", 8, valores.del(8),2);
		assertEquals("testeDelComListaPreenchida", 1, valores.del(1),3);
		assertEquals("testeDelComListaPreenchida", 3, valores.del(3),6);
		assertEquals("testeDelComListaPreenchida", 5, valores.del(5),1);
	}

	@Test
	public void testDelComListaVazia() {
		this.limparLista();
		assertEquals("testDelComListaVazia", -1, valores.del(4), 0);
	}

	@Test
	public void testeSize() {
		for (int i = 0; i <10; i++) {
			valores.ValorInt.add(i);
		}
		assertEquals("testeSize", 10, valores.size());
	}

	@Test
	public void testeMeanIgualZero() {
		this.limparLista();
		assertEquals("testMeanIgualZero", 0, valores.mean(), 0);
	}

	@Test
	public void testeMeanRetornaMediaDosValores() {
		assertEquals("testMeanRetornaMediaDosValores", 6, valores.mean(), 0);
	}

	@Test
	public void testeGreaterRetornaMaiorValor() {
		assertEquals("testGreaterRetornaMaiorValor", 10, valores.greater());
	}
	
	@Test
	public void testeGreaterVazioRetornaMenosUm() {
		this.limparLista();
		assertEquals("testGreaterVazioRetornaMenosUm", -1, valores.greater());
	}
	
	@Test
	public void testeLowerVazioRetornaMenosUm(){
		this.limparLista();
		assertEquals("testeLowerVazioRetornaMenosUm", -1, valores.lower());
	}

	
	@Test
	public void testeLowerRetornaMenorValor(){
		assertEquals("testeLoweRetornaMenorValor", 1, valores.lower());
	}
	
	
	
}	
