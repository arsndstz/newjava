	
// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

	public class Dog{
		String name; // フィールド
		static int count = 0; // クラス全体で共有する変数
		
		// コンストラクタ
		Dog(String name){
			this.name = name;
			count++;
		}
		
		// メソッド
		void showName() {
			System.out.println(name);
		}

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Dog dog1 = new Dog("ポメラニアン");
		Dog dog2 = new Dog("柴犬");
		
		dog1.showName(); // 名前を出力
		dog2.showName();
		
		System.out.println(Dog.count); // 数を出力
		
		// 現在の日時を取得
		LocalDateTime now = LocalDateTime.now();
		
		//　フォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		
		// 文字列に変化して代入
		String formattedDate = now.format(formatter);
		
		System.out.println(formattedDate);
		
		}

	}