package prob06;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print(">>");
			String line = scanner.nextLine();
			
			if(line.equals("quit")) {
				break;
			}
			
			String[] s_line = line.split(" ");
			int result = 0;
			
			// 1 -> 기호
			switch (s_line[1]) {
			case "+":
				Add add = new Add();
				add.setValue(Integer.parseInt(s_line[0]), Integer.parseInt(s_line[2]));
				result = add.calculate();
				break;
			case "-":
				Sub sub = new Sub();
				sub.setValue(Integer.parseInt(s_line[0]), Integer.parseInt(s_line[2]));
				result = sub.calculate();
				break;
			case "*":
				Mul mul = new Mul();
				mul.setValue(Integer.parseInt(s_line[0]), Integer.parseInt(s_line[2]));
				result = mul.calculate();
				break;
			case "/":
				Div div = new Div();
				div.setValue(Integer.parseInt(s_line[0]), Integer.parseInt(s_line[2]));
				result = div.calculate();
				break;
			}
			
			System.out.println(result);
		}
	}
}