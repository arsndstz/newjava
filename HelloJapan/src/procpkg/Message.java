package procpkg;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Message {
	
	// フィールド
	private String country;
	private String food;
	private String category;
	
	// コンストラクタ
	public Message(String country, String food, String category) {
		this.country = country;
		this.food = food;
		this.category = category;
	}
	
	// メソッド
	public String greeting() {
		return "こんにちは！ここは" + this.country + "です！";
	}
	
	public String taste() {
		return "この" + this.food + "はうまい";
	}
	
	public String category() {
		return this.food + "は" + this.category + "です";
	}
	
	public String nowDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		return "今の現在日時は" + now.format(fmt) + "です";
	}

}