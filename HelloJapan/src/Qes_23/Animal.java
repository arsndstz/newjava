/*
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 */

package Qes_23;

public class Animal {

	// フィールドをカプセル化
	private String name;
	private double length;
	private int speed;
	
	public Animal(String name, double length, int speed) {
		this.name = name;
		this.length = length;
		this.speed = speed;
	}
	
	// ゲッター
	public String getName() {
		return name;
	}
	
	public double getLength() {
		return length;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	// セッター
	public void setName(String name) {
		this.name = name;
	}
	
	public void setLength(double length) {
		if(length > 0) {
			this.length = length;
		}
	}
	
	public void setSpeed(int speed) {
		if(speed >= 0) {
			this.speed = speed;
		}
	}
	
}
