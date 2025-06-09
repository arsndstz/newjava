package curriculum_A;

import java.math.BigDecimal;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// 宣言のみをする
			byte by;
			short sh;
			int i;
			long lo;
			float f;
			double d;
			char c;
			String str;
			boolean b;
		
		
		// 初期値を代入し初期化する
			by = 0;
			sh = 0;
			i = 0;
			lo = 0L;
			f = 0.0f;
			d = 0.0d;
			c = '\u0000';
			str = null;
			b = false;
		
			
		// 代入する
			by = 10;
			sh = 100;
			i = 1000;
			lo = 10000;
			f = 9.5f;
			d = 10.5d;
			c = 'a';
			str = "ハロー";
			b = true;
			
		
		// コンソールに出力する
			System.out.println(by+sh+i+lo);
			System.out.println(f+d);
			System.out.println(c+"\t"+str+"\t"+b);
			System.out.println(by+sh+i+lo+f+d);
			System.out.println(by*sh*i*lo);
			System.out.println(d/sh);
			System.out.println(by-sh);
		
			System.out.println( );
			
		
		// 「ハローJAVA43」と正しく表示させる
			byte by1 = 20;
			byte by2 = 23;
			System.out.println("ハローJAVA"+(by1+by2));
			
			System.out.println( );
			
		// ローカル変数に代入し出力する
			String name = "山田太郎";
			int age = 18;
			double height = 170.5;
			double weight = 62.2;
			String food = "寿司";
			
			System.out.println("初めまして"	 + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "です");
			System.out.println("体重は" + weight + "です");
			System.out.println("好きな食べ物は" + food + "です");
			
			System.out.println( );
			
			
		// BMIを出力する
			double BMI = (weight/(height*height))*10000;
			
			 BigDecimal bd = new BigDecimal(BMI);
			 BigDecimal bd1 = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
			
			
			System.out.println("BMIは" + bd1 + "です");
		
	}

}
