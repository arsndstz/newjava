package Qes_22;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
	public static void main(String[] args) {
		
		Dog dog1 = new Dog(); // Dogクラスを呼び出し
		dog1.showName();
		
		Dog dog2 = new Dog(3);
		dog2.showCount();
		
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd H:m:s");
		String formattedDate = now.format(formatter);
		System.out.println(formattedDate);
		
		
	}

}
