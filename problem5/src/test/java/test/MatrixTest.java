package test;
import static org.junit.Assert.*;
import org.junit.Test;
import main.MatrixWorker;


public class MatrixTest {

	@Test
	public void test() {
		MatrixWorker mw = new MatrixWorker ();
		int [][] inputMatrix = new int [][] {{1,2,3},{4,5,0},{7,8,9}};
		int [][] expectedMatrix = new int [][] {{1,2,0},{0,0,0},{7,8,0}};
		assertEquals(expectedMatrix,mw.processMatrix(inputMatrix));
	}

}
