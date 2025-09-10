package procpkg;

public class Elephant extends Animal {
	public Elephant(double length, int speed) {
		super("ゾウ", length, speed);
	}

	@Override
	public String getScientificName() {
		return "ロキソドンタ・サイクロティス";
	}
}