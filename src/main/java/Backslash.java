/**
 * Gives character value which displaced by "a" steps to the right from backslash code
 */
public class Backslash {
	private final static char SLSH = '\\';
	
	public static char shift(int a) {
		return (char) (SLSH + a);
	}
}
