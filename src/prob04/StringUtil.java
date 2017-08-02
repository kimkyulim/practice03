package prob04;

public class StringUtil {
    public static String concatenate(String[] str) {
		String result =" ";
		//for(변수타입 변수이름 : 배열이름){
			//실행부분;
		//}
		
		for(String s : str) {
			result+=s;
		}
		return result;
        //문자열을 결합하여 리턴 하는 메소드 구현
    }
}
