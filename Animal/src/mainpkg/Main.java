package mainpkg;
import java.util.Scanner;

import procpkg.Animal;
import procpkg.Chimpanzee;
import procpkg.Elephant;
import procpkg.Lion;
import procpkg.Panda;
import procpkg.Parakeet;
import procpkg.Zebra;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("コンソールに文字を入力してください");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] animalData = input.split(",");
		
		for (String data : animalData) {
			String[] parts = data.split(":");
			String name = parts[0];
			double length = Double.parseDouble(parts[1]);
			int speed = Integer.parseInt(parts[2]);
			
			Animal animal = null;
			switch (name) {
				case "ライオン": animal = new Lion(length, speed); break;
				case "ゾウ": animal = new Elephant(length, speed); break;
				case "パンダ": animal = new Panda(length, speed); break;
				case "チンパンジー": animal = new Chimpanzee(length, speed); break;
				case "シマウマ": animal = new Zebra(length, speed); break;
				case "インコ": animal = new Parakeet(length, speed); break;
				default: System.out.println(name + " は未登録です");
			}
			
			if (animal != null) {
				animal.printInfo();
			}
		}
		
		sc.close();
	}
}