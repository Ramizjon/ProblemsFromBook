package problem23;

public class NumberChecker {

	public int getBitSwapCount(int numberOne, int numberTwo) {
		int count = 0;
		for (int z = numberOne ^ numberTwo; z != 0; z = z >> 1) {
			count += z & 1;
		}
		return count;
	}
}
