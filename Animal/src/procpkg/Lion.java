package procpkg;

public class Lion extends Animal {
	public Lion(double length, int speed) {
		super("ライオン", length, speed);
	}

	@Override
	public String getScientificName() {
		return "パンテラ レオ";
	}
}