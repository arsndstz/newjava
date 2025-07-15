package curriculum_B;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Qes_6 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] products = input.split("、"); // 「、」で区切る
		
		for(String product : products) {
			int randomStock = ThreadLocalRandom.current().nextInt(0,12); // 0～11のランダム
			
			switch(product) {
			case "テレビ":
			case "ディスプレイ":
				int displayStock = product.equals("ディスプレイ") ? 11 - randomStock : randomStock;
				System.out.println(product + "の残り台数は" + displayStock + "台です");
				break;
				
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(product + "の残り台数は" + randomStock + "台です");
				break;
			
			default:
				System.out.println("「" + product + "」は指定の商品ではありません");
				break;
			}
		}
		
		scanner.close();
	}

}