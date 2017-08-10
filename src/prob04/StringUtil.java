package prob04;

public class StringUtil {
	public static String concatenate(String[] str) {
		String result="";
		for (int i = 0; i < str.length; i++) {
//			System.out.print(str[i]); // -> 문자열 
			result += str[i];
		}
		
		return result;
	}
}
