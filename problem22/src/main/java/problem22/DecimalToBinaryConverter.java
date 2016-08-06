package problem22;

public class DecimalToBinaryConverter {

	public String convertToBinary(double value) {
		StringBuilder sb = new StringBuilder("0.");
		while (value > 0) {
			if (value * 2 >= 1) {
				sb.append("1");
				value = value*2 - 1;
			}
			else {
				sb.append("0");
				value*=2;
			}
			if (sb.length()>32){
				return "ERROR";
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		DecimalToBinaryConverter converter = new DecimalToBinaryConverter();
		System.out.println(converter.convertToBinary(0.72));
	}

}
