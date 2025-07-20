package curriculum_B;

public class Qes_5 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		for(int i = 1; i < 10; i++) {
			for(int j = 1; j < 21; j++) {
				System.out.printf("%03d*%03d=%03d", j, i, j * i); // 0埋めする
				if(j < 20) {
					System.out.print("||");
				}
			}
			System.out.println();
		}
		
	}

}
