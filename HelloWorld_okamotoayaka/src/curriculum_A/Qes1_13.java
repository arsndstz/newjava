package curriculum_A;

import java.math.BigDecimal;

public class Qes1_13 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// ①宣言のみをする
			byte by;
			short sh;
			int i;
			long lo;
			float f;
			double d;
			char c;
			String str;
			boolean b;
		
		
		// ②初期値を代入し初期化する
			by = 0;
			sh = 0;
			i = 0;
			lo = 0L;
			f = 0.0f;
			d = 0.0d;
			c = '\u0000';
			str = null;
			b = false;
		
			
		// ③代入する
			by = 10;
			sh = 100;
			i = 1000;
			lo = 10000;
			f = 9.5f;
			d = 10.5d;
			c = 'a';
			str = "ハロー";
			b = true;
			
		
		// ④コンソールに出力する
			System.out.println(by+sh+i+lo);
			System.out.println(f+d);
			System.out.println(c+"\t"+str+"\t"+b);
			System.out.println(by+sh+i+lo+f+d);
			System.out.println(by*sh*i*lo);
			System.out.println(d/sh);
			System.out.println(by-sh);
		
			System.out.println( );
			
		
		// ⑤「ハローJAVA43」と正しく表示させる
			byte by1 = 20;
			byte by2 = 23;
			System.out.println("ハローJAVA"+(by1+by2));
			
			System.out.println( );
			
		// ⑥ローカル変数に代入し出力する
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
			
			
		// ⑦BMIを出力する
			double BMI = (weight/(height*height))*10000;
		// 小数第一までを表示する
			 BigDecimal bd = new BigDecimal(BMI);
			 BigDecimal bd1 = bd.setScale(1, BigDecimal.ROUND_HALF_UP);
			
			System.out.println("BMIは" + bd1 + "です");
			
			System.out.println( );
			
			
		// ⑧再代入する
			name = "鈴木一郎";
			age = 24;
			height = 168.5;
			weight = 64.2;
			food = "オムライス";
			
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "です");
			System.out.println("体重は" + weight + "です");
			System.out.println("好きな食べ物は" + food + "です");
		
			double BMI2 = (weight/(height*height))*10000; // BMIを計算する
			BigDecimal bd2 = new BigDecimal(BMI2);
			BigDecimal bd3 = bd2.setScale(1, BigDecimal.ROUND_HALF_UP); // 小数第三以下を四捨五入する
				 
			System.out.println("BMIは" + bd3 + "です");
		
			System.out.println( );
			
			
		// ⑨自己代入する
			age = age + age;
			height = height + height;
			weight = weight + weight;
			
			System.out.println("初めまして" + name + "です");
			System.out.println("年齢は" + age + "歳です");
			System.out.println("身長は" + height + "です");
			System.out.println("体重は" + weight + "です");
			System.out.println("好きな食べ物は" + food + "です");
			
			double BMI3 = (weight/(height*height))*10000;
			BigDecimal bd4 = new BigDecimal(BMI3);
			BigDecimal bd5 = bd4.setScale(2, BigDecimal.ROUND_HALF_UP);
				 
			System.out.println("BMIは" + bd5 + "です");
			
			System.out.println( );
			
			
		// ⑩年齢が25以上ならtrue
			age = 24;
			int result = age >= 25 ? 1 : 0;
			
			switch(result) {
				case 1:
					System.out.println(true);
					break;
				case 0:
					System.out.println(false);
					break;
				default:
					System.out.println("ageの値が正しくありません");
					break;
			}
			
			System.out.println( );
			
			
		// ⑪文字列型に型変換する
			age = 24;
			height = 168.5;
			weight = 64.2;
			String strage = String.valueOf(age);
			String strheight = String.valueOf(height);
			String strweight = String.valueOf(weight);
			
			System.out.println(strage+strheight+strweight);
			
			System.out.println( );
			
			
		// ⑫整数型に型変換する
			int parsedAge = Integer.parseInt(strage);
			double  parsedHeight = Double.parseDouble(strheight);
			
			System.out.println(parsedAge);
			System.out.println(parsedHeight);
			
			System.out.println( );
			
			
		// ⑬年齢が25もしくは身長が160以上の場合はtrueを出力する
			System.out.println(age >= 25 || height >= 160);
			
			System.out.println( );
		
	}

}
