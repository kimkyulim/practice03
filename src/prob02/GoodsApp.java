package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Goods객체 배열에 저장 
		Goods[] goods = new Goods[COUNT_GOODS];
		
		for(int i=0; i<COUNT_GOODS; i++) {
			//값받는것 line으로 받기 
			String line = scanner.nextLine();
			//System.out.println(line);
			//line으로 받으면 분류를 해야하는데 분류는 split사용
			String[] tokens = line.split(" ");

			String name = tokens[0];
			int price = Integer.parseInt( tokens[1] );
			int count = Integer.parseInt( tokens[2] );
			
			Goods g = new Goods();
			g.getGoodsName();
			g.getGoodsPrice();
			g.getGoodCount();
			
			goods[i]=g;
		}
		for( Goods g : goods ) {
			System.out.println( 
				g.getGoodsName() + 
				"(가격:" + g.getGoodCount() + "원)이 " +
				g.getGoodsPrice() + "개 입고 되었습니다." );
		}
			System.out.println( g.getGood+ ":" + price + ":" + count );
			
		}
		scanner.close();
	}
}
