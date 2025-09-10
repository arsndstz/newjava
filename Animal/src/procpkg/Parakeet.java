package procpkg;

public class Parakeet extends Animal {
	public Parakeet(double length, int speed) {
		super("インコ", length, speed);
	}

@Override
	public String getScientificName() {
		return "不明";
	}
}