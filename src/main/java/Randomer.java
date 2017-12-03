/**
 * Returns random size sequence of same character
 */
public class Randomer {
	private static String sign = "!";
	
	/**
	 * Math.random returns double greater than or equal to 0.0 and less than 1.0. so we need to +1
	 * @param min
	 * @param max
	 * @return
	 */
	private static int randomRange(int min, int max) {
		return (int) (Math.random() * (max - min + 1) + min);
	}
	
	public static String getSequence() {
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < randomRange(5,10); i++) {
			result.append(sign);
		}
		return result.toString();
	}
}
