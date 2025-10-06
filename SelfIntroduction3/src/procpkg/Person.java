package procpkg;

public class Person {

	private static int count = 0;
	private String firstName;
	private String lastName;
	private int age;
	private double height, weight;

	public Person(String firstName, String lastName, int age, double height, double weight){
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String fullName(){
		return this.firstName + this.lastName;
	}

	public double bmi(){
		return this.weight / (this.height * this.height);
	}

	public void print(){
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
		
		double bmiValue = this.bmi();
		double truncated = Math.floor(bmiValue);
		
		System.out.println("BMIは" + truncated + "です");
	}

	public static void printCount(){
		System.out.println("合計" + Person.count + "人です");
	}
}