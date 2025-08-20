import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		// Dog
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
		
		
		// Animal
		// Q3
		Animal b = new Animal();
		System.out.println(b.name);
		
		// Q4
		Animal a = new Animal(3);
		System.out.println(a.count);
		
	}

}
