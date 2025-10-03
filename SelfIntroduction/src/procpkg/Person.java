package procpkg;

public class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	
	private static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name,int age,double height,double weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		count++;
	}
	
	public static int getCount() {
		return count;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	
	public double bmi() {
		return this.weight / (this.height * this.height);
	}
	
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "です");
		System.out.printf("BMIは%.1fです%n" ,this.bmi());
	}
}