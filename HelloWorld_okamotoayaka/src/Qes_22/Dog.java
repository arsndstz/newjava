package Qes_22;

public class Dog {
	// フィールド
	String name;
	int count;
	
	// コンストラクタ
	public Dog() {
		this.name = "犬";
		this.count = 1;
	}
	
	public Dog(int count) {
		this.name = "犬";
		this.count = count;
	}
	
	// メソッド
	public void showName() {
		System.out.println(name);
	}
	
	public void showCount() {
		System.out.println(count);
	}

}
