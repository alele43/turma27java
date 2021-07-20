package introducao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomaTest {

	@Test
	void testSomar() {
		Soma Somador = new Soma();
		
		assertEquals(40, Somador.somar(10,30));
		
		
	}

}
