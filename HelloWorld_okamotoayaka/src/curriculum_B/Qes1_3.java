package curriculum_B;

import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qes1_3 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String name;
		int num;
		Pattern p;
		Matcher m;
		boolean flag;
		Scanner scanner = new Scanner(System.in);  //Scannerで初期化
		
		System.out.println("名前を入力してください");
		
		// 名前が正しく入力されるまで繰り返す
		do {
			name = scanner.nextLine();
			num = name.length();
			p = Pattern.compile("^[a-zA-Z0-9]*$");
			m = p.matcher(name);
			
			// 10文字以上の場合
			if(num > 10) {
				System.out.println("名前を10文字以内にしてください");
				flag = false;
			}
			
			// 文字数が0以下の場合
			else if(name.isEmpty()) {
				System.out.println("名前を入力してください");
				flag = false;
			}
			
			 // nullの場合
			else if(Objects.isNull(name)) {
				System.out.println("名前を入力してください");
				flag = false;
			} 
			
			// 半角英数字以外の場合
			else if(!m.find()) {
				System.out.println("半角英数字のみで名前を入力してください");
			flag = false;
			}
			
			// 正しく入力された場合
			else {
				System.out.println("ユーザー名「" + name +"」を登録しました");
				flag = true;
				break;
			}
		}
		while(flag == false);
		
		System.out.println( );
		
		
		
		// じゃんけんをする
		int count = 1;
		
		do {
			System.out.println("何をだしますか。自分の手を決めてください。0：グー、1：チョキ、2：パー");
			int playerHand = scanner.nextInt();
			
			System.out.println("相手の手を決めてください");
			int playerHand2 = scanner.nextInt();
			
			System.out.println(name + "の手は「" + playerHand + "」相手の手は「" + playerHand2 + "」");
			
			if(playerHand == 0 && playerHand2 == 1 || playerHand == 1 && playerHand2 == 2 || playerHand == 2 && playerHand2 == 0) {
				System.out.println("やるやん。次は俺にリベンジさせて");
				flag = true;
			}else if(playerHand == 0 && playerHand2 == 0 || playerHand == 1 && playerHand2 == 1 || playerHand == 2 && playerHand2 == 2) {
				System.out.println("DRAWあいこもう一回しましょう！");
				count++;
				flag = false;
			}else {
				switch(playerHand2){
				  case 0:
					  System.out.println("俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！");
					  flag = false;
					    break;
				  case 1:
					  System.out.println("俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も俺が勝ちますよ");
					  flag = false;
					    break;

				  default:
					  System.out.println("俺の勝ち！何で負けたか明日まで考えといてください。そしたら何かが見えてくるはずです");
					  flag = false;
				}
				count++;
			}	
		}
		
		while(flag == false);
		
		System.out.println("勝つまでにかかった合計回数は" + count + "です");
			
		
		scanner.close();
		
	}

}
