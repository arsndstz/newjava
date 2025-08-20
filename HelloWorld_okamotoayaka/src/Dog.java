	
// Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
// Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
// 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください。

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
	}