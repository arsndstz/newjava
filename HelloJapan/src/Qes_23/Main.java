/*
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 */

package Qes_23;

public class Main {

	public static void main(String[] args) {

		Animal a = new Animal("ライオン", 2.1, 80);
		
		System.out.println("動物名：" + a.getName());
		System.out.println("体調：" + a.getLength() + "m");
		System.out.println("速度：" + a.getSpeed() + "km/h");
	}

}
