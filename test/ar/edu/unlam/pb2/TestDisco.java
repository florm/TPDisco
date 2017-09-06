package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestDisco {

	@Test
	public void testQuePruebaEnvioArgumentosdeRadioEnConstructor() {
		Disco miDisco= new Disco(5.0, 10.0);
		assertEquals(5, miDisco.getRadioInterior(), 0.01);
		assertEquals(10, miDisco.getRadioExterior(), 0.01);
	}
	
	@Test
	public void testQuePruebaCalculoDePerimetroInternoEnConstructor(){
		Disco miDisco = new Disco (5.0,10.0);
		assertEquals(31.41, miDisco.getPerimetroInterior(), 0.01);
	}
	
	@Test
	public void testQuePruebaCalculoDePerimetroExternoEnConstructor(){
		Disco miDisco = new Disco (5.0,10.0);
		assertEquals(62.83, miDisco.getPerimetroExterior(), 0.01);
	}
	
	@Test
	public void testQuePruebaCalculoDeSuperficieEnConstructor(){
		Disco miDisco=new Disco (5.0, 10.0);
		assertEquals(235.62, miDisco.getSuperficie(), 0.01);
	}
	
	@Test
	public void testQuePruebaMetodoCambiarRadioInterior(){
		Disco miDisco = new Disco(5.0,10.0);
		miDisco.cambiarRadioInterior(2.0);
		//se espera que getRadioInterior sea 2:
		assertEquals(2, miDisco.getRadioInterior(), 0.01);
		//se espera que se haya actualizado el valor del perimetro interior:
		assertEquals(12.56, miDisco.getPerimetroInterior(), 0.01);
		//se espera que se haya actualizado el valor de la superficie:
		assertEquals(301.59, miDisco.getSuperficie(), 0.01);
	}
	
	@Test
	public void testQuePruebaMetodoCambiarRadioExterior(){
		Disco miDisco = new Disco(5.0,10.0);
		miDisco.cambiarRadioExterior(15.0);
		//se espera que getRadioExterior sea 15:
		assertEquals(15, miDisco.getRadioExterior(), 0.01);
		//se espera que se haya actualizado el valor del perimetro exterior:
		assertEquals(94.24, miDisco.getPerimetroExterior(), 0.01);
		//se espera que se haya actualizado el valor de la superficie:
		assertEquals(628.32, miDisco.getSuperficie(), 0.01);	
	}

}