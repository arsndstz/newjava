package procpkg;

public class Zebra extends Animal {
	public Zebra(double length, int speed) {
		super("シマウマ", length, speed);
	}

@Override
	public String getScientificName() {
		return "チャップマンシマウマ";
	}
}