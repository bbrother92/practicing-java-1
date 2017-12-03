/**
 * Enum describes languages and its speakers number
 *
 * @author Vivyen
 * @version 1.0
 * @since 2017-04-16
 */
public class Enums {
	enum Languages {
		ENGLISH("en", 400), GERMAN("de", 90), FRENCH("fr", 80), RUSSIAN("ru", 150);
		private String code;
		private int spkrsCount;
		
		/**
		 * Enum constructor with
		 *
		 * @param code       Language code
		 * @param spkrsCount Native speakers
		 */
		
		Languages(String code, int spkrsCount) {
			this.code = code;
			this.spkrsCount = spkrsCount;
		}
		
		public String getLangCode() {
			return code;
		}
		
		public int getSpkrsCount() {
			return spkrsCount;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
		
		public void setSpkrsCount(int spkrsCount) {
			this.spkrsCount = spkrsCount;
		}
		
		
	}
	
	public static String getSequence() {
		StringBuilder result = new StringBuilder();
		for (Enums.Languages val : Enums.Languages.values()) {
			result.append(val.ordinal() + ":" + val + " language has " + val.getSpkrsCount() + " million speakers");
			result.append("ISO 639-1 code is " + val.getLangCode() + ".\n");
		}
		return result.toString();
	}
}














