package main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * TASK:
 * Write and algorithm such that if an element in an
 * MxN matrix is 0, it's entire row and column are set to 0
 * 
 * @param matrix is the matrix we're going to process
 * @return same matrix where rows and columns of zero elements are set to zero
 * 
 * @author ramizjon
 */
 
public class MatrixWorker {
	
	public int [][] processMatrix (int[][]matrix){
		
		Map <Integer, Integer> zeroPositions = new HashMap <Integer, Integer> ();
		int matLength = matrix[0].length;
		
		for (int i = 0; i < matLength; i++){
			for (int k = 0; k < matLength; k++){
				if (matrix [i][k] == 0){
					zeroPositions.put(i, k);
				}
			}
		}
		
		 Iterator it = zeroPositions.entrySet().iterator();
		 while (it.hasNext()) {
		   	Map.Entry <Integer, Integer> pair = (Map.Entry)it.next();
		   	for (int i = 0; i<matLength; i++){
		    		matrix[(int)pair.getKey()][i] = 0;
		    		matrix[i][(int)pair.getValue()] = 0;
		    }
		 }
		    
		 return matrix;
	}
	
}
