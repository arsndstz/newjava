package curriculum_New_question;

import java.util.Random;

public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void greet(String word, int version) {
		System.out.println("Hello " + word + " " + version);
	}
	
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void multiply(int a, int b) {
		int result = a * b;
		System.out.println(result);
	}
	
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	public static void printArray(int[] numbers) {
		for (int number : numbers) {
			System.out.println(number);
		}
	}
	
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	public static void multiply(double a, double b) {
		double result = a + b;
		System.out.println(result);
	}
	
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
	public static int[] RandomNumbers(int count) {
		Random rand = new Random();
		int[] numbers = new int[count];
		
		for(int i = 0; i < count; i++) {
			int num = rand.nextInt(100) + 1; // 1～100でランダム生成
			numbers[i] = num;
			System.out.println(num);
		}
		return numbers;
	}
	
	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static void printAverage(int[] numbers) {
		if(numbers == null || numbers.length == 0) {
			System.out.println("配列が空です");
			return;
		}
		
		double sum = 0;
		for(int num : numbers) {
			sum += num;
		}
		
		double average = sum / numbers.length;
		System.out.println(average);
	}
	
	// Q7 引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static double getAverage(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
		throw new IllegalArgumentException("配列がnullまたは空です");
		}

		double sum = 0;
		for (int num : numbers) {
		sum += num;
		}

		return sum / numbers.length;
		}

	// 50以上かどうかtrue、falseを返す
	public static boolean isAbove50(double value) {
		return value >= 50.0;
		}



	public static void main(String[] args) {
		// 作成したメソッドをここで呼び出してください
		// TODO 自動生成されたメソッド・スタブ
		
		
		// Q1
		greet("JavaSE", 11);
		System.out.println( );
		
		
		// Q2
		multiply(6, 4);
		System.out.println( );
			
		
		// Q3
		int[] sumple = {5, 10, 15, 20};
		printArray(sumple);
		System.out.println( );
			
		
		// Q4
		multiply(1.5, 3.2);
		System.out.println( );
			
		
		// Q5
		int[] results = RandomNumbers(5);
		System.out.println( );
		
		
		// Q6
		printAverage(results);
		System.out.println( );
		
		
		// Q7
		double average = getAverage(results);
		
		boolean result = isAbove50(average);
		System.out.println(result);
		
		
		
	}

}
