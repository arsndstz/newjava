package curriculum_B;

import java.util.Scanner;

public class Qes_7 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scanner = new Scanner(System.in);
		int students;
		
		// 生徒数の入力
		do {
			System.out.print("生徒の人数を入力してください(2人以上)：");
			students = scanner.nextInt();
		}while(students < 2); // 1以下なら再入力
		
		// 生徒ごとの成績の入力
		int[][] scores = new int[students][4];
		String[] subjects = {"英語","数学","理科","社会"};
		
		for(int i = 0; i < students; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(i+1 + "人目の『" + subjects[j] + "』の点数を入力してください：");
				scores[i][j] = scanner.nextInt();
			}
		}
		
		scanner.close();
		System.out.println();
		
		// 生徒ごとの平均点を出力
		for(int i = 0; i < students; i++) {
			int studentSum = 0;
			for(int j = 0; j < 4; j++) {
				studentSum += scores[i][j]; // 生徒ごとの合計点数を計算
			}
			double studentAvg = (double) studentSum / 4; // 平均値を計算
			System.out.printf("%d人目の平均点は%.2f点です。\n", i + 1, studentAvg );
		}
		
		System.out.println();
		
		// 各教科の平均点を出力
		double totalSum = 0;
		for(int j = 0; j < 4; j++) {
			int subjectSum = 0;
			for(int i = 0; i < students; i++) {
				subjectSum += scores[i][j]; // 各教科の合計を計算
			}
			double subjectAvg = (double) subjectSum / students; // 各教科の平均値を計算
			totalSum += subjectSum; // 全体の合計を計算
			System.out.printf("%sの平均点は%.2f点です。\n", subjects[j], subjectAvg);
		}
		
		// 全体の平均点を出力
		double allAvg = totalSum / (students * 4); // 全体の平均を計算
		System.out.printf("全体の平均点は%.2f点です。", allAvg);
	}

}
