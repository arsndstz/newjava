package mainpkg;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import procpkg.Prefecture;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Prefecture[] prefs = {
			new Prefecture("北海道", "札幌市", 83424),
			new Prefecture("青森県", "青森市", 9646),
			new Prefecture("岩手県", "盛岡市", 15275),
			new Prefecture("宮城県", "仙台市", 7282),
			new Prefecture("秋田県", "秋田市", 11638),
			new Prefecture("山形県", "山形市", 9323),
			new Prefecture("福島県", "福島市", 13784),
			new Prefecture("茨城県", "水戸市", 6097),
			new Prefecture("栃木県", "宇都宮市", 6408),
			new Prefecture("群馬県", "前橋市", 6362),
			new Prefecture("埼玉県", "さいたま市", 3798)
		};
		
		System.out.println("数字をカンマ区切りで入力してください:");
		String input = sc.nextLine();
		
		System.out.println("昇順 or 降順 を入力してください:");
		String order = sc.nextLine();
		
		// 数字を配列に変換
		String[] numbers = input.split(",");
		List<Prefecture> selected = new ArrayList<>();
		
		for (String numStr : numbers) {
			int index = Integer.parseInt(numStr.trim());
			if (index >= 0 && index < prefs.length) {
				selected.add(prefs[index]);
			}
		}
		
		// ソート処理
		Comparator<Prefecture> comparator = Comparator.comparingDouble(Prefecture::getArea);
		if (order.equals("降順")) {
			comparator = comparator.reversed();
		}
		selected.sort(comparator);
		
		for (Prefecture p : selected) {
			p.printInfo();
		}
		
		sc.close();
	}
}