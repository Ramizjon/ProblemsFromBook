import static org.junit.Assert.*;

import org.junit.Test;
public class TestCompressor {

	@Test
	public void testCompression() {
		StringCompressor sc = new StringCompressor ();
		String actual = sc.compressString("aabcccccaaa");
		assertEquals("a2b1c5a3", actual);
	}

	@Test
	public void testEmptyCompression(){
		StringCompressor sc = new StringCompressor ();
		String actual = sc.compressString("");
		assertEquals("", actual);
	}

}
