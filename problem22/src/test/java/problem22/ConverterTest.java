package problem22;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConverterTest {

	@Test
	public void test() {
		DecimalToBinaryConverter converter = new DecimalToBinaryConverter();
		assertEquals("0.011", converter.convertToBinary(0.375));
		assertEquals("ERROR", converter.convertToBinary(0.72));
	}

}
