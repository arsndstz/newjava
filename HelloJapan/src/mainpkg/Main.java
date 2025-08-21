package mainpkg;

// パッケージをインポート
import procpkg.Message;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Message msg = new Message("日本","寿司","和食");
		
		if(msg != null) {
		System.out.println(msg.greeting());
		System.out.println(msg.taste());
		System.out.println(msg.category());
		System.out.println(msg.nowDateTime());
	}else {
		System.out.println("Messageインスタンスが作成されていません");
	}

	}
}
